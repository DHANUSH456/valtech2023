package firstWeb;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class CounterFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("Destroy of Counter Filter......");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Do Filter of Counter Filter");
		@SuppressWarnings("unchecked")
		Map<String, Integer> counters =  (Map<String, Integer>) ((FilterConfig) request).getServletContext().getAttribute("counters");
		HttpServletRequest req = (HttpServletRequest)request;
		String url = req.getRequestURI();
		if(counters.containsKey(url)) {
			counters.put(url,counters.get(url)+1);
		}
		else {
			counters.put(url, 1);
		}
		printCounters(counters);
		chain.doFilter(request, response);
	}

	private void printCounters(Map<String, Integer> counters) {
		for(String s:counters.keySet()) {
			System.out.println("Url ="+s+"Counter ="+counters.get(s));
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Init of Counter Filter");
		Map<String, Integer> counters =  new HashMap<>();
		filterConfig.getServletContext().setAttribute("counters", counters);	
	}
}

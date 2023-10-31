package cssParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CSSConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String line;
    String cssClass = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cssFilePath = "C:\\Users\\Dhanush.V\\Desktop\\OTHERS\\HTML Resources\\Training\\Valtech 4-10 Sept 2023\\HTML5 Material\\Examples\\styles.css";
		Map<String, String> cssMap = readCSSFile(cssFilePath);

		request.setAttribute("cssMap", cssMap);
		request.getRequestDispatcher("cssConverter.jsp").forward(request, response);
	}

	public static Map<String, String> readCSSFile(String filePath) {
        Map<String, String> cssMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)){{

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.startsWith(".")) {
                    if (cssClass != null) {
                        cssMap.put(cssClass, cssMap.get(cssClass).trim());
                    }
                    cssClass = line.substring(1);
                } else if (cssClass != null) {
                    cssMap.put(cssClass, cssMap.get(cssClass) + " " + line);
                }
            }
        } 
        }
        catch(IOException e)){
            e.printStackTrace();
        }

        return cssMap;
    }

	// Other methods (convertHexToRGB and hexToRgb) remain the same
}

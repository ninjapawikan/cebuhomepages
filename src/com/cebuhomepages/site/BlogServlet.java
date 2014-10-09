package com.cebuhomepages.site;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class BlogServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.sendRedirect("http://cebuhomepages.blogspot.com");
	}
}

package com.perforce.benchmark;

import spark.Request;
import spark.Response;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StaticFileUtil {

	public static Object file(Request request, Response response) {

		String file = "../sample/commons-lang-2.6.jar";

		try (InputStream in = new FileInputStream(new File(file))) {
			// write to the ServletOutputStream
			HttpServletResponse raw = response.raw();
			byte[] buf = new byte[1024 * 64];
			int bytesRead;
			while ((bytesRead = in.read(buf)) != -1) {
				raw.getOutputStream().write(buf, 0, bytesRead);
			}
			raw.getOutputStream().flush();
			raw.getOutputStream().close();
			in.close();
			return raw;
		} catch (IOException e) {
			e.printStackTrace();
			response.status(404);
			return null;
		}
	}
}

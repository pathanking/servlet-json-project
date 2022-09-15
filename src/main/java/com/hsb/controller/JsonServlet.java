package com.hsb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.hsb.model.User;
import com.hsb.service.UserService;

@WebServlet("/JsonServlet")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JsonServlet() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside service method");
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("UTF-8");

		List<User> users = UserService.getUsers();

		Gson gson = new Gson();
		String json = gson.toJson(users);

		out.println(json);
		out.close();

	}

}

package it.uniroma3.controller.helper;

import javax.servlet.http.HttpServletRequest;

public class HelperProduct {

	public boolean isValid(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String code = request.getParameter("code");
		String price = request.getParameter("price");
		boolean errors = false;

		if ( name == null || name.equals("")) {
			request.setAttribute("nameErr","Campo Obbligatorio");
			errors = true;
		}

		if ( code == null || code.equals("")) {
			request.setAttribute("codeErr","Campo Obbligatorio");
			errors = true;
		}

		if ( price == null || price.equals("")) {
			request.setAttribute("priceErr","Campo Obbligatorio");
			errors = true;
		}
		else {
			try{
				Float.parseFloat(price);
			}
			catch (NumberFormatException e) {
				request.setAttribute("priceErr","Il Prezzo deve essere un Numero");
				errors = true;
			}
		}
		return !errors;
	}
}

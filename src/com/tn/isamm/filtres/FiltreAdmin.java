package com.tn.isamm.filtres;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Filtre
 */
//@WebFilter("/Filtre")
public class FiltreAdmin implements Filter {

    /**
     * Default constructor. 
     */
    public FiltreAdmin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpServletResponse response2 = (HttpServletResponse) response;
		/* Récupération de la session depuis la requête */
		HttpSession session = request2.getSession();
		/**
		* Si l'objet utilisateur n'existe pas dans la session en cours, alors
		* l'utilisateur n'est pas connecté.
		*/
		if (session.getAttribute("sessionUtilisateur") == null || !session.getAttribute("sessionUtilisateur").toString().contains("role=1")) {
		/* Redirection vers la page publique */
			//System.out.println("SU=NULL");
		response2.sendRedirect("/LeVoyageur/Filtre.jsp");
		//System.out.println("ok1");
		}
		else {
		/* Affichage de la page restreinte */
			
			chain.doFilter( request, response );
		//System.out.println("ok2");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

package com.example.progweb.Progweb.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void ResourceNotFoundException1(String message) {
		throw new ResourceNotFoundException("O recurso solicitado não foi encontrado.");
    }	
}

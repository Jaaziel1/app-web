package com.betha.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.hibernate.Session;

import com.betha.business.Pessoa;
import com.betha.util.FabricaSessao;


public class PessoaConverter implements Converter {
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		
		if (value != null) {
			Pessoa pessoa;
			Session session = FabricaSessao.abrirSessao();
			return pessoa = (Pessoa) session.createCriteria(Pessoa.class).list().get(new Integer(value));
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		if (value != null)
			return ((Pessoa) value).getCodigo().toString();
		return null;
	}

}

package br.edu.ufcg.pra.client;

import java.util.ArrayList;

import org.datanucleus.query.evaluator.memory.SetExpression;


import com.google.gwt.user.client.ui.FocusWidget;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class SubFolhaPanel extends SimplePanel {
	
    protected VerticalPanel linhas;
    private Grid grid;
    private HorizontalPanel colunas;
    private ArrayList<VerticalPanel> coluna;
    private int ultimaColuna = 0;
 // private ArrayList<FocusWidget> widgets;
	
	public SubFolhaPanel(String title){
		linhas = new VerticalPanel();
		/*if (title.equals("Dados b�sicos")) {
			linhas.add(new HTML("<a class='anc' name ='"+"legalidade"+"'></a>"));
		}else */if (title.equals("Legalidade")) {
			linhas.add(new HTML("<a class='anc' name ='"+"legalidade"+"'></a>"));
		} else if (title.equals("Autoriza��o")) {
			linhas.add(new HTML("<a class='anc2' name ='"+"autorizacao"+"'></a>"));
		} else if (title.equals("Corretude")) {
			linhas.add(new HTML("<a class='anc3' name ='"+"corretude"+"'></a>"));
		} else if (title.equals("Minuta do Edital")) {
			linhas.add(new HTML("<a class='anc4' name ='"+"minuta"+"'></a>"));
		} else if (title.equals("Adjudica��o")) {
			linhas.add(new HTML("<a class='anc6' name ='"+"adjudicacao"+"'></a>"));
		} else if (title.equals("Homologa��o")) {
			linhas.add(new HTML("<a class='anc7' name ='"+"homologacao"+"'></a>"));
		} else if (title.equals("Publica��o")) {
			linhas.add(new HTML("<a class='anc8' name ='"+"publicacao"+"'></a>"));
		} else if (title.equals("Empenho")){
			linhas.add(new HTML("<a class='anc9' name = '"+"empenho"+"'></a>"));
		} else if (title.equals("Recebimento")){
			linhas.add(new HTML("<a class='anc10' name ='"+"recebimento"+"'></a>"));
		}
		grid = new Grid();
		linhas.add(new HTML("<h2>"+title+"</h2>"));
		colunas =  new HorizontalPanel();
		//colunas.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		colunas.setSpacing(10);
		coluna = new ArrayList<VerticalPanel>();
		coluna.add(new VerticalPanel());
		coluna.add(new VerticalPanel());
		colunas.add(coluna.get(0));
		colunas.add(coluna.get(1));
		linhas.add(colunas);
		super.add(linhas);
		this.setStyleName("subfolha");
//widgets = new ArrayList<FocusWidget>();
	}
	
	public void addToSuper(Widget w) {
		super.add(w);
	}
	
	@Override
	public void add(Widget w) {
		//w.setHeight("20px");
		linhas.add(w);
	}
//	public void setEnabled(boolean enabled) {
//		for(FocusWidget w: widgets) {
//			w.setEnabled(enabled);
//		}
//	
//	}
	
	public void add(Widget w, String title) {
//		for(FocusWidget w: wids) {
//			widgets.setEnabled(enabled);
//		}
		
		HorizontalPanel campoEtexto = new HorizontalPanel();
		campoEtexto.setSpacing(10);
		Label ti = new Label(title);
		ti.setWidth("140px");
		ti.setHorizontalAlignment( HasHorizontalAlignment.ALIGN_RIGHT);
		campoEtexto.add(ti);
		w.setWidth("200px");
		w.setHeight("25px");
		campoEtexto.add(w);
		coluna.get(ultimaColuna).add(campoEtexto);
		if(ultimaColuna == 0) ultimaColuna = 1;
		else ultimaColuna = 0;
		
		
	}
	
	public void addToBottom(Widget w, String title) {
		HorizontalPanel campoEtexto = new HorizontalPanel();
		campoEtexto.setStylePrimaryName("tipoPedido");
		campoEtexto.setSpacing(10);
		Label ti = new Label(title);
		ti.setWidth("140px");
		ti.setHorizontalAlignment( HasHorizontalAlignment.ALIGN_RIGHT);
		campoEtexto.add(ti);
		w.setWidth("200px");
		w.setHeight("25px");
		campoEtexto.add(w);
		add(campoEtexto);
		
		
	}
}

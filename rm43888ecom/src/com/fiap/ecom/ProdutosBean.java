package com.fiap.ecom;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "p")
public class ProdutosBean {

	private int codProduto;
	private String descricao;
	private String imagem;

	public String btnPesquisar() {
		switch (getCodProduto()) {
		case 0:
			setDescricao("");
			break;
		case 1:
			setDescricao("Calça");
			setImagem("Calca.jpg");
			break;
		case 2:
			setDescricao("Blusa");
			setImagem("Blusa.jpg");
			break;
		case 3:
			setDescricao("Jaqueta");
			setImagem("Jaqueta.jpg");
			break;
		case 4:
			setDescricao("Sapato");
			setImagem("sem_foto.gif");
			break;
		default:
			setDescricao("Produto não encontrado");
		}
		return "";
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}

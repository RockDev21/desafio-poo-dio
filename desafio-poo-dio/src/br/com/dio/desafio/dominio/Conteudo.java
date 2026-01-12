package br.com.dio.desafio.dominio;

public abstract class Conteudo {

   protected static final double XP_PADRAO = 10d;

   private String tiutlo;
   private String descricao;

   public abstract double calcularXp();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }
}

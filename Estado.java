public enum Estado {
    Muerto("(x_x) fin del juego (Muerto)"), //Salud | Energia == 0 | Edad > 15
    Cansado("6. (=_=) zzzz.... (Cansado)"), //Energia <= 15
    Enojado("(ôwô) grrrr.... (Enojado)"), //Energia & Salud <= 30 (Edad > 5)
    Hambriento("(0o0) hambre hambre! (Hambriento)"), //Salud <= 20 (Edad <= 5) || <= 50 (Edad > 5)
    Triste("(._.) snif.... (Triste)"), //Felicidad <=20
    Feliz("\\(^_^)/ Weeeeeh! (Feliz)"), //Felicidad >= 60
    Neutro("(-_-) Meh....(Neutro)"); //Estado Natural

    private String mensaje;

    private Estado (String mensaje){
		this.mensaje = mensaje;
	}

    public String getMensaje() {
		return mensaje;
	}
}

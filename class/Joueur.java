public class Joueur {
	
	static final int ROUGE = 0;
	static final int JAUNE = 1;
	private String nickname;
	private boolean isWin;
	private int couleur;
	
	public Joueur (String nickname, int couleur) {
		this.nickname = nickname;
		this.couleur = couleur;
		if (couleur!=0 && couleur!=1) {couleur = 3;}
	}
	
	
	
	
}

/**
 * 
 */
package entities;


/**
 * @author perse
 *
 */
/**
 * Représente tous les attributs possibles d'un produit
 *
 */
public class Composition {
	private Additif additif;
	private Allergene allergene;
	private Categorie categorie;
	private Marque marque;
	private Produit produit;
	private ScoreNutritionnel scoreNutritionnel;
	private Double energie100g;
	private Double graisse100g;
	private Double sucres100g;
	private Double fibres100g;
	private Double proteines100g;
	private Double sel100g;
	private Double vitA100g;
	private Double vitD100g;
	private Double vitE100g;
	private Double vitK100g;
	private Double vitC100g;
	private Double vitB1100g;
	private Double vitB2100g;
	private Double vitPP100g;
	private Double vitB6100g;
	private Double vitB9100g;
	private Double vitB12100g;
	private Double calcium100g;
	private Double magnesium100g;
	private Double iron100g;
	private Double fer100g;
	@Override
	public String toString() {
		return "Composition [energie100g=" + energie100g + ", graisse100g=" + graisse100g + ", sucres100g=" + sucres100g
				+ ", fibres100g=" + fibres100g + ", proteines100g=" + proteines100g + ", sel100g=" + sel100g
				+ ", vitA100g=" + vitA100g + ", vitD100g=" + vitD100g + ", vitE100g=" + vitE100g + ", vitK100g="
				+ vitK100g + ", vitC100g=" + vitC100g + ", vitB1100g=" + vitB1100g + ", vitB2100g=" + vitB2100g
				+ ", vitPP100g=" + vitPP100g + ", vitB6100g=" + vitB6100g + ", vitB9100g=" + vitB9100g + ", vitB12100g="
				+ vitB12100g + ", calcium100g=" + calcium100g + ", magnesium100g=" + magnesium100g + ", iron100g="
				+ iron100g + ", fer100g=" + fer100g + "]";
	}
	/**
	 * @return the additif
	 */
	public Additif getAdditif() {
		return additif;
	}
	/**
	 * @param additifs the additif to set
	 */
	public void setAdditif(Additif additif) {
		this.additif = additif;
	}
	/**
	 * @return the allergene
	 */
	public Allergene getAllergene() {
		return allergene;
	}
	/**
	 * @param allergenes the allergene to set
	 */
	public void setAllergene(Allergene allergene) {
		this.allergene = allergene;
	}
	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}
	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	/**
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}
	/**
	 * @param marque the marque to set
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	/**
	 * @return the produits
	 */
	public Produit getProduit() {
		return produit;
	}
	/**
	 * @param produits the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	/**
	 * @return the scoreNutritionnel
	 */
	public ScoreNutritionnel getScoreNutritionnel() {
		return scoreNutritionnel;
	}
	/**
	 * @param scoreNutritionnel the scoreNutritionnel to set
	 */
	public void setScoreNutritionnel(ScoreNutritionnel scoreNutritionnel) {
		this.scoreNutritionnel = scoreNutritionnel;
	}
	/**
	 * @return the energie100g
	 */
	public Double getEnergie100g() {
		return energie100g;
	}
	/**
	 * @param energie100g the energie100g to set
	 */
	public void setEnergie100g(Double energie100g) {
		this.energie100g = energie100g;
	}
	/**
	 * @return the graisse100g
	 */
	public Double getGraisse100g() {
		return graisse100g;
	}
	/**
	 * @param graisse100g the graisse100g to set
	 */
	public void setGraisse100g(Double graisse100g) {
		this.graisse100g = graisse100g;
	}
	/**
	 * @return the sucres100g
	 */
	public Double getSucres100g() {
		return sucres100g;
	}
	/**
	 * @param sucres100g the sucres100g to set
	 */
	public void setSucres100g(Double sucres100g) {
		this.sucres100g = sucres100g;
	}
	/**
	 * @return the fibres100g
	 */
	public Double getFibres100g() {
		return fibres100g;
	}
	/**
	 * @param fibres100g the fibres100g to set
	 */
	public void setFibres100g(Double fibres100g) {
		this.fibres100g = fibres100g;
	}
	/**
	 * @return the proteines100g
	 */
	public Double getProteines100g() {
		return proteines100g;
	}
	/**
	 * @param proteines100g the proteines100g to set
	 */
	public void setProteines100g(Double proteines100g) {
		this.proteines100g = proteines100g;
	}
	/**
	 * @return the sel100g
	 */
	public Double getSel100g() {
		return sel100g;
	}
	/**
	 * @param sel100g the sel100g to set
	 */
	public void setSel100g(Double sel100g) {
		this.sel100g = sel100g;
	}
	/**
	 * @return the vitA100g
	 */
	public Double getVitA100g() {
		return vitA100g;
	}
	/**
	 * @param vitA100g the vitA100g to set
	 */
	public void setVitA100g(Double vitA100g) {
		this.vitA100g = vitA100g;
	}
	/**
	 * @return the vitD100g
	 */
	public Double getVitD100g() {
		return vitD100g;
	}
	/**
	 * @param vitD100g the vitD100g to set
	 */
	public void setVitD100g(Double vitD100g) {
		this.vitD100g = vitD100g;
	}
	/**
	 * @return the vitE100g
	 */
	public Double getVitE100g() {
		return vitE100g;
	}
	/**
	 * @param vitE100g the vitE100g to set
	 */
	public void setVitE100g(Double vitE100g) {
		this.vitE100g = vitE100g;
	}
	/**
	 * @return the vitK100g
	 */
	public Double getVitK100g() {
		return vitK100g;
	}
	/**
	 * @param vitK100g the vitK100g to set
	 */
	public void setVitK100g(Double vitK100g) {
		this.vitK100g = vitK100g;
	}
	/**
	 * @return the vitC100g
	 */
	public Double getVitC100g() {
		return vitC100g;
	}
	/**
	 * @param vitC100g the vitC100g to set
	 */
	public void setVitC100g(Double vitC100g) {
		this.vitC100g = vitC100g;
	}
	/**
	 * @return the vitB1100g
	 */
	public Double getVitB1100g() {
		return vitB1100g;
	}
	/**
	 * @param vitB1100g the vitB1100g to set
	 */
	public void setVitB1100g(Double vitB1100g) {
		this.vitB1100g = vitB1100g;
	}
	/**
	 * @return the vitB2100g
	 */
	public Double getVitB2100g() {
		return vitB2100g;
	}
	/**
	 * @param vitB2100g the vitB2100g to set
	 */
	public void setVitB2100g(Double vitB2100g) {
		this.vitB2100g = vitB2100g;
	}
	/**
	 * @return the vitPP100g
	 */
	public Double getVitPP100g() {
		return vitPP100g;
	}
	/**
	 * @param vitPP100g the vitPP100g to set
	 */
	public void setVitPP100g(Double vitPP100g) {
		this.vitPP100g = vitPP100g;
	}
	/**
	 * @return the vitB6100g
	 */
	public Double getVitB6100g() {
		return vitB6100g;
	}
	/**
	 * @param vitB6100g the vitB6100g to set
	 */
	public void setVitB6100g(Double vitB6100g) {
		this.vitB6100g = vitB6100g;
	}
	/**
	 * @return the vitB9100g
	 */
	public Double getVitB9100g() {
		return vitB9100g;
	}
	/**
	 * @param vitB9100g the vitB9100g to set
	 */
	public void setVitB9100g(Double vitB9100g) {
		this.vitB9100g = vitB9100g;
	}
	/**
	 * @return the vitB12100g
	 */
	public Double getVitB12100g() {
		return vitB12100g;
	}
	/**
	 * @param vitB12100g the vitB12100g to set
	 */
	public void setVitB12100g(Double vitB12100g) {
		this.vitB12100g = vitB12100g;
	}
	/**
	 * @return the calcium100g
	 */
	public Double getCalcium100g() {
		return calcium100g;
	}
	/**
	 * @param calcium100g the calcium100g to set
	 */
	public void setCalcium100g(Double calcium100g) {
		this.calcium100g = calcium100g;
	}
	/**
	 * @return the magnesium100g
	 */
	public Double getMagnesium100g() {
		return magnesium100g;
	}
	/**
	 * @param magnesium100g the magnesium100g to set
	 */
	public void setMagnesium100g(Double magnesium100g) {
		this.magnesium100g = magnesium100g;
	}
	/**
	 * @return the iron100g
	 */
	public Double getIron100g() {
		return iron100g;
	}
	/**
	 * @param iron100g the iron100g to set
	 */
	public void setIron100g(Double iron100g) {
		this.iron100g = iron100g;
	}
	/**
	 * @return the fer100g
	 */
	public Double getFer100g() {
		return fer100g;
	}
	/**
	 * @param fer100g the fer100g to set
	 */
	public void setFer100g(Double fer100g) {
		this.fer100g = fer100g;
	}
}

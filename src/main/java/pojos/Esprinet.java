package pojos;

import java.io.Serializable;

import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

public class Esprinet implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	String codice;
	String codiceproduttore;
	String codiceEan;
	String prod;
	String descrizioneprod;
	String nomeCasaprod;
	String Tipo;
	String catMerc;
	String DescCatMerc;
	String fam;
	String descFam;
	String grMaster;
	String descGrMaster;
	String dispo;
	String arrivi;
	String stato;
	String Descrizione;
	String DescEstesa;
	String PrezzoListino;
	@Property("prezzo")
	String prezzoRivenditore;
	String ScontoDealerStandard;
	String prezzoPromo;
	String dataPromoda;
	String dataPromoA;
	String PesoLordo;
	String Altezza;
	String lunghezza;
	String profondita;
	String raee;
	String modello;
	String Tempodoaesprinet;
	String tempodoaenduser;
	String tempogaranziaenduser;
	String Streetprice;
	String qtaminimaord;
	
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getCodiceproduttore() {
		return codiceproduttore;
	}
	public void setCodiceproduttore(String codiceproduttore) {
		this.codiceproduttore = codiceproduttore;
	}
	public String getCodiceEan() {
		return codiceEan;
	}
	public void setCodiceEan(String codiceEan) {
		this.codiceEan = codiceEan;
	}
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}
	public String getDescrizioneprod() {
		return descrizioneprod;
	}
	public void setDescrizioneprod(String descrizioneprod) {
		this.descrizioneprod = descrizioneprod;
	}
	public String getNomeCasaprod() {
		return nomeCasaprod;
	}
	public void setNomeCasaprod(String nomeCasaprod) {
		this.nomeCasaprod = nomeCasaprod;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getCatMerc() {
		return catMerc;
	}
	public void setCatMerc(String catMerc) {
		this.catMerc = catMerc;
	}
	public String getDescCatMerc() {
		return DescCatMerc;
	}
	public void setDescCatMerc(String descCatMerc) {
		DescCatMerc = descCatMerc;
	}
	public String getFam() {
		return fam;
	}
	public void setFam(String fam) {
		this.fam = fam;
	}
	public String getDescFam() {
		return descFam;
	}
	public void setDescFam(String descFam) {
		this.descFam = descFam;
	}
	public String getGrMaster() {
		return grMaster;
	}
	public void setGrMaster(String grMaster) {
		this.grMaster = grMaster;
	}
	public String getDescGrMaster() {
		return descGrMaster;
	}
	public void setDescGrMaster(String descGrMaster) {
		this.descGrMaster = descGrMaster;
	}
	public String getDispo() {
		return dispo;
	}
	public void setDispo(String dispo) {
		this.dispo = dispo;
	}
	public String getArrivi() {
		return arrivi;
	}
	public void setArrivi(String arrivi) {
		this.arrivi = arrivi;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public String getDescrizione() {
		return Descrizione;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	public String getDescEstesa() {
		return DescEstesa;
	}
	public void setDescEstesa(String descEstesa) {
		DescEstesa = descEstesa;
	}
	public String getPrezzoListino() {
		return PrezzoListino;
	}
	public void setPrezzoListino(String prezzoListino) {
		PrezzoListino = prezzoListino;
	}
	public String getPrezzoRivenditore() {
		return prezzoRivenditore;
	}
	public void setPrezzoRivenditore(String prezzoRivenditore) {
		this.prezzoRivenditore = prezzoRivenditore;
	}
	public String getScontoDealerStandard() {
		return ScontoDealerStandard;
	}
	public void setScontoDealerStandard(String scontoDealerStandard) {
		ScontoDealerStandard = scontoDealerStandard;
	}
	public String getPrezzoPromo() {
		return prezzoPromo;
	}
	public void setPrezzoPromo(String prezzoPromo) {
		this.prezzoPromo = prezzoPromo;
	}
	public String getDataPromoda() {
		return dataPromoda;
	}
	public void setDataPromoda(String dataPromoda) {
		this.dataPromoda = dataPromoda;
	}
	public String getDataPromoA() {
		return dataPromoA;
	}
	public void setDataPromoA(String dataPromoA) {
		this.dataPromoA = dataPromoA;
	}
	public String getPesoLordo() {
		return PesoLordo;
	}
	public void setPesoLordo(String pesoLordo) {
		PesoLordo = pesoLordo;
	}
	public String getAltezza() {
		return Altezza;
	}
	public void setAltezza(String altezza) {
		Altezza = altezza;
	}
	public String getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(String lunghezza) {
		this.lunghezza = lunghezza;
	}
	public String getProfondita() {
		return profondita;
	}
	public void setProfondita(String profondita) {
		this.profondita = profondita;
	}
	public String getRaee() {
		return raee;
	}
	public void setRaee(String raee) {
		this.raee = raee;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getTempodoaesprinet() {
		return Tempodoaesprinet;
	}
	public void setTempodoaesprinet(String tempodoaesprinet) {
		Tempodoaesprinet = tempodoaesprinet;
	}
	public String getTempodoaenduser() {
		return tempodoaenduser;
	}
	public void setTempodoaenduser(String tempodoaenduser) {
		this.tempodoaenduser = tempodoaenduser;
	}
	public String getTempogaranziaenduser() {
		return tempogaranziaenduser;
	}
	public void setTempogaranziaenduser(String tempogaranziaenduser) {
		this.tempogaranziaenduser = tempogaranziaenduser;
	}
	public String getStreetprice() {
		return Streetprice;
	}
	public void setStreetprice(String streetprice) {
		Streetprice = streetprice;
	}
	public String getQtaminimaord() {
		return qtaminimaord;
	}
	public void setQtaminimaord(String qtaminimaord) {
		this.qtaminimaord = qtaminimaord;
	}

	
	
}

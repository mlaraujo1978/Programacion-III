package edu.utn;

public class Main {

    public static void main(String[] args) {

	AdministrationJobPostulant postulantAdm1 = new AdministrationJobPostulant("adm1@gmail.com",JobsCategory.ADMINISTRATION);
	AdministrationJobPostulant postulantAdm2 = new AdministrationJobPostulant("adm2@gmail.com",JobsCategory.ADMINISTRATION);

	GastronomyJobPostulant postulantGas1 = new GastronomyJobPostulant("gas1@gmail.com",JobsCategory.GASTRONOMY);
	GastronomyJobPostulant postulantGas2 = new GastronomyJobPostulant("gas2@gmail.com",JobsCategory.GASTRONOMY);

	ITJobPostulant postulantIT1 = new ITJobPostulant("it1@gmail.com",JobsCategory.IT);
	ITJobPostulant postulantIT2 = new ITJobPostulant("it2@gmail.com",JobsCategory.IT);

	LandingPage landingPage = new LandingPage();
	landingPage.suscribe(postulantAdm1);
	landingPage.suscribe(postulantAdm2);
	landingPage.suscribe(postulantGas1);
	landingPage.suscribe(postulantGas2);
	landingPage.suscribe(postulantIT1);
	landingPage.suscribe(postulantIT2);

	landingPage.unSuscribe(postulantAdm1);

	landingPage.addNewOfferJob("Ford Motor Company", JobsCategory.IT, "Programador Sr.");
	landingPage.addNewOfferJob("Tucson S.R.L", JobsCategory.GASTRONOMY, "Ayudante de cocina.");
	landingPage.addNewOfferJob("Telefonica Moviles Argentina", JobsCategory.ADMINISTRATION, "Adminitrativo Junior.");
    }
}

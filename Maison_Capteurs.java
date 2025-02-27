import java.util.Observable;

public class Maison_Capteurs extends Observable {
    static TypeCapteur TypeCapteur;
    String NomCapteur;
    static Boolean EtatCapteur;

    public Maison_Capteurs(String nomCapteur, TypeCapteur typeCapteur, Boolean etatCapteur) {
        NomCapteur = nomCapteur;
        TypeCapteur = typeCapteur;
        EtatCapteur = etatCapteur;
    }

    public enum TypeCapteur {
        LUMINOSITE, MOUVEMENT, TEMPERATURE
    };

    public enum EtatCapteur {
        true, false
    };

    public void setNomCapteur(String nomCapteur) {
        NomCapteur = nomCapteur;
    }

    public void setTypeCapteur(TypeCapteur typeCapteur) {
        TypeCapteur = typeCapteur;
    }

    //Retourne le type de capteur
    public static TypeCapteur findByNameTypeCapteur(String name) {
        TypeCapteur result = null;
        for (TypeCapteur typeCapteur : TypeCapteur.values())
            if (typeCapteur.name().equalsIgnoreCase(name)) {
                result = typeCapteur;
                break;
            }
        return result;
    }

    //Retourne l'état du capteur'
    public static EtatCapteur findByNameEtatCapteur(String name) {
        EtatCapteur result = null;
        for (EtatCapteur etatCapteur : EtatCapteur.values())
            if (etatCapteur.name().equalsIgnoreCase(name)) {
                result = etatCapteur;
                break;
            }
        return result;
    }

    @Override
    public String toString() {
        return "Nom : " + NomCapteur + ", Capteurs de : " + TypeCapteur + ", Etat : " + EtatCapteur;
    }
}


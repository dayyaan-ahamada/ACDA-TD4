public class Palindrome {
    public int palindrome(String phrase){
        final String SEPARATEUR = " ";
        String mots[] = phrase.split(SEPARATEUR);//on decoupe la phrase en mots
        int nb_palindrome=0;//variable comptant le nombre de mot palindrome
        for (int i=0;i<mots.length;i++){//pour chaque mot
            if (!mots[i].equals("")){//si egale a nul alors on saute au prochain
                String[] tabMot;
                tabMot=mots[i].split("");//on decoupe le mot en lettre
                boolean mot=true;
                for (int k=0;k<tabMot.length/2;k++){//compare si la premiere est egal a la derniere et ainsi de suite
                    if (!tabMot[k].equals(tabMot[tabMot.length-1-k])){
                        mot=false;
                    }
                }
                if (mot == true){//si mot palindrome
                    nb_palindrome++;
                }
            }

        }
        return nb_palindrome;
    }
}

public class Palindrome {
    public int palindrome(String phrase){
        final String SEPARATEUR = " ";
        String mots[] = phrase.split(SEPARATEUR);
        int nb_palindrome=0;
        for (int i=0;i<mots.length;i++){
            if (!mots[i].equals("")){
                System.out.println("**"+mots[i]+"$$");
                String[] tabMot;
                tabMot=mots[i].split("");
                boolean mot=true;
                for (int k=0;k<tabMot.length/2;k++){
                    if (!tabMot[k].equals(tabMot[tabMot.length-1-k])){
                        mot=false;
                    }
                }
                if (mot == true){
                    nb_palindrome++;
                }
            }

        }
        return nb_palindrome;
    }
}

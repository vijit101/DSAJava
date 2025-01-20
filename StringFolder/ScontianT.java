package StringFolder;

public class ScontianT {


    public static void main(String[] args) {
        boolean mybol = checkSequence("abchjssuodjvdijhhbndasgllo",
                        "codings");
        System.out.print(mybol);
    }

    public static boolean checkSequence(String a, String b) {
        boolean[] Haschars = new boolean[b.length()];
        int k = 0;
        boolean isseq = false;
        while (k<Haschars.length) {
            Haschars[k] = false;
            k++;
        }

        for(int i=0;i<b.length();i++){
            char ithchar = b.charAt(i);
            for(int j=0;j<a.length();j++){
                if(ithchar == a.charAt(j)){
                    Haschars[i] = true;
                    break;
                }
            }
        }
        k = 1;
        isseq = Haschars[k];
        while (k<=Haschars.length-1) {
            
            isseq = isseq && Haschars[k];
            k++;
        }
        return isseq;
	}
}

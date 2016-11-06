package JavaBasics.godaddy;

import JavaBasics.CollectionFramework.printingJob;

/**
 * Created by jaydatta on 10/22/16.
 */
public class Two extends printingJob {

    public static void main(String[] args) {

        String ipString = "IBM cognitive computing|IBM \"cognitive\" computing is a revolution| ibm cognitive  computing|'IBM Cognitive Computing' is a revolution?";
        String[] original = ipString.split("\\|");

        ipString = ipString.trim();
        ipString = ipString.replaceAll("\\s+", " ");

        boolean abc = "abc74783fhjdsf".contains("[^A-Za-z|\\s]");
        System.out.println(abc);

        ipString = ipString.replaceAll("[^A-Za-z0-9|\\s]", "");
        ipString = ipString.toLowerCase();

  //      System.out.println(ipString);

        String[] modified = ipString.split("\\|");

        for (int i = 0; i < original.length; i++) {
            modified[i] = modified[i].trim();
        }
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {

                if ( ((j != i)) && !(modified[i] == null) && !(modified[j] == null)
                                && modified[i].contains(modified[j])) {
                    if (modified[i].equals(modified[j])) {
                        if (original[i].length() < original[j].length()) {
                            original[j] = null;
                            modified[j] = null;
                        }
                        else if (original[i].length() > original[j].length()) {
                            original[i] = null;
                            modified[i] = null;
                        }
                        else if (original[i].length() == original[j].length()) {
                            if (i < j) {
                                original[j] = null;
                                modified[j] = null;
                            } else {
                                original[i] = null;
                                modified[i] = null;
                            }
                        }
                    } else {
                        modified[j] = null;
                        original[j] = null;
                    }
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < original.length; i++) {
            if ((original[i] == null))
                continue;
            else
                sb.append(original[i] + "|");
        }




        System.out.println(sb.toString());
    }


}

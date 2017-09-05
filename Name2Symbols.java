import java.util.Scanner;

public class Name2Symbols {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		String name = "";

		String a = "   #   \n  # #  \n #### \n#    #";
		String b = "#####\n#    #\n#####\n#    #\n#####";
		String c = " #####\n#     \n#     \n#     \n #####";
		String d = "#####\n#    #\n#    #\n#####";
		String e = "######\n#     \n####  \n#     \n######";
		String f = "######\n#     \n###   \n#     \n#    ";
		String g = "######\n#     \n#   ##\n######";
		String h = "#    #\n#    #\n######\n#    #\n#    #";
		String ii = "######\n  #   \n  #   \n  #   \n######";
		String j = "######\n   #  \n   #  \n   #   \n####  ";
		String k = "#  #\n# # \n##  \n# # \n#  #";
		String l = "#     \n#     \n#     \n#     \n######";
		String m = "##   ##\n# # # #\n#  #  #\n#     #\n#     #";
		String n = "#   #\n##  #\n# # #\n#  ##\n#   #";
		String o = " #### \n#    #\n#    #\n#    #\n #### ";
		String p = "##### \n#    #\n##### \n#     \n#     ";
		String q = " #### \n#    #\n#  # #\n#   ##\n #####\n      #";
		String r = "##### \n#    #\n##### \n# #   \n#  #  ";
		String s = " #####\n#\n ####\n     #\n#####";
		String t = "######\n   #\n   #\n   #\n   #";
		String u = "#    #\n#    #\n#    #\n#    #\n ####";
		String v = "#       #\n #     #\n  #   #\n   # #\n    #";
		String w = "#   #   #   #\n #   # #   #\n  #   #   #\n   # # # #\n    #   #";
		String x = "#   #\n # #\n  #\n # #\n#   #";
		String y = "#   #\n # #\n  #\n #\n#";
		String z = "######\n    #\n   #\n  #\n######";

		System.out.print("Nombre(Solo minúsculas): ");
		name = S.nextLine();
		System.out.println();
		System.out.println();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
			}
			if (name.charAt(i) == 'a') {
				System.out.println(a);
				System.out.println();
			}
			if (name.charAt(i) == 'b') {
				System.out.println(b);
				System.out.println();
			}
			if (name.charAt(i) == 'c') {
				System.out.println(c);
				System.out.println();
			}
			if (name.charAt(i) == 'd') {
				System.out.println(d);
				System.out.println();
			}
			if (name.charAt(i) == 'e') {
				System.out.println(e);
				System.out.println();
			}
			if (name.charAt(i) == 'f') {
				System.out.println(f);
				System.out.println();
			}
			if (name.charAt(i) == 'g') {
				System.out.println(g);
				System.out.println();
			}
			if (name.charAt(i) == 'h') {
				System.out.println(h);
				System.out.println();
			}
			if (name.charAt(i) == 'i') {
				System.out.println(ii);
				System.out.println();
			}
			if (name.charAt(i) == 'j') {
				System.out.println(j);
				System.out.println();
			}
			if (name.charAt(i) == 'k') {
				System.out.println(k);
				System.out.println();
			}
			if (name.charAt(i) == 'l') {
				System.out.println(l);
				System.out.println();
			}
			if (name.charAt(i) == 'm') {
				System.out.println(m);
				System.out.println();
			}
			if (name.charAt(i) == 'n') {
				System.out.println(n);
				System.out.println();
			}
			if (name.charAt(i) == 'o') {
				System.out.println(o);
				System.out.println();
			}
			if (name.charAt(i) == 'p') {
				System.out.println(p);
				System.out.println();
			}
			if (name.charAt(i) == 'q') {
				System.out.println(q);
				System.out.println();
			}
			if (name.charAt(i) == 'r') {
				System.out.println(r);
				System.out.println();
			}
			if (name.charAt(i) == 's') {
				System.out.println(s);
				System.out.println();
			}
			if (name.charAt(i) == 't') {
				System.out.println(t);
				System.out.println();
			}
			if (name.charAt(i) == 'u') {
				System.out.println(u);
				System.out.println();
			}
			if (name.charAt(i) == 'v') {
				System.out.println(v);
				System.out.println();
			}
			if (name.charAt(i) == 'w') {
				System.out.println(w);
				System.out.println();
			}
			if (name.charAt(i) == 'x') {
				System.out.println(x);
				System.out.println();
			}
			if (name.charAt(i) == 'y') {
				System.out.println(y);
				System.out.println();
			}
			if (name.charAt(i) == 'z') {
				System.out.println(z);
				System.out.println();
			}
		}
	}
}

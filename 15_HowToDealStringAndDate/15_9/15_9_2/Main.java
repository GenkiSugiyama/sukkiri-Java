public class Main {
  public static void main(String[] args) {
    // String folder = "c:¥javadev";
    String folder = "c:¥user¥";
    String file = "readme.txt";
    System.out.println(perfectFileName(folder, file));
  }

  // public static String perfectFileName(String folder, String file) {
  //   if (folder.charAt(folder.length() - 1) != '¥') {
  //     folder = folder + "¥";
  //   }

  //   return folder + file;
  // }

  public String concatPath(String folder, String file) {
    if (!folder.endWith("¥¥")) {
      folder += "¥";
    }
    return folder + file;

  }
}
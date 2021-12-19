package ArrayTest;

public class Practice2 {
    public static void main(String[] args) {
        // 1차원 배열에서, 문자 M을 가지고 있는 아이템의 수를 출력해보기
        // 배열.length : 배열에 들어있는 아이템 갯수
        // 문자열.indexof(String key) : 문자 key가 해당 문자열에 있으면
        // 해당 문자의 위치(index 값)를 리턴하고, 없으면 -1을 리턴함.
        String dataset[] = {
            "Braund, Mr. Owen Harris",
            "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
            "Heikkinen, Miss. Laina",
            "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
            "Allen, Mr. William Henry",
            "Moran, Mr. James",
            "McCarthy, Mr. Timothy J",
            "Palsson, Master. Gosta Leonard",
            "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
            "Nasser, Mrs. Nicholas (Adele Achem)",
            "Sandstrom, Miss. Marguerite Rut",
            "Bonnell, Miss. Elizabeth",
            "Saundercock, Mr. William Henry",
            "Andersson, Mr. Anders Johan",
            "Vestrom, Miss. Hulda Amanda Adolfina",
            "Hewlett, Mrs. (Mary D Kingcome)",
            "Rice, Master. Eugene",
            "Williams, Mr. Charles Eugene",
            "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
            "Masselmani, Mrs. Fatima",
            "Fynney, Mr. Joseph J",
            "Beesley, Mr. Lawrence",
            "McGowan, Miss. Anna",
            "Sloper, Mr. William Thompson",
            "Palsson, Miss. Torborg Danira",
            "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
            "Emir, Mr. Farred Chehab",
            "Fortune, Mr. Charles Alexander",
            "Dwyer, Miss. Ellen",
            "Todoroff, Mr. Lalio"
        };

        // 출력
        Integer count = 0;
        for(Integer item = 0; item<dataset.length; item++) {
            if(dataset[item].indexOf("M") != -1) {
                count++;
            } else {
                System.out.println("아이템 : " + dataset[item]
                                    + ", 인덱스 : " + dataset[item].indexOf("M"));
            }
        }

        System.out.println("1차원 배열에서 대문자 M이 들어간 아이템 갯수는 "
                            + count + "개 입니다.");
    }
}

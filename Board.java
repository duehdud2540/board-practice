//Aconflict/A 추가한 내용
//B가 변경한내용

//변경중
//변경고
//변경대
//변경초
public class Board {

//a계정이 또수정함
    private int    id;
    private String title;
    private String author;
    // getter/setter 생략
}
    // feature/A: 조회수 기능 추가
    private int viewCount = 0;
    public int  getViewCount()         { return viewCount; }
    public void incrementViewCount()   { this.viewCount++; }

package hello.itemservice.domain.item;

public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    //생성자로 상수들을 정의해준다
    ItemType(String description) {
        this.description = description;
    }
}

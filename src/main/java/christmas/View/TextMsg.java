package christmas.View;

public enum TextMsg {
    WELCOME("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다."),
    ASK_DATE("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)"),
    ASK_DISHES("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)"),
    VAR_MONTH("월 "),
    SHOW_INTRO("일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!"),
    SHOW_ORDERED_MENU("<주문 메뉴>"),
    SHOW_INIT_TOTAL_PRICE("<할인 전 총주문 금액>"),
    SHOW_GIFT_MENU("<증정 메뉴>"),
    SHOW_BENEFITS("<혜택 내역>"),
    SHOW_TOTAL_BENEFITS("<총혜택 금액>"),
    SHOW_EXPECTED_TOTAL_PRICE("<할인 후 예상 결제 금액>"),
    EVENT_BEDGE("<12월 이벤트 배지>"),
    VAR_WON("원");
    public final String label;

    private TextMsg(String s) {
        this.label = s;
    }
}

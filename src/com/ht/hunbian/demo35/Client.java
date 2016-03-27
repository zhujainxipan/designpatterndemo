package com.ht.hunbian.demo35;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Client {
    public static void main(String[] args) {
        Card card = initIC();
        System.out.println("初始化卡信息;;;;;;;;;;;;");

        showCard(card);

        Trade trade = createTrade();
        DeductionFacade.deduct(card, trade);

        System.out.println("交易凭证;;;;;;;;;;;;");
        System.out.println(trade.getTradeNo() + "交易成功");
        showCard(card);


    }

    /**
     * 产生一条交易
     * @return
     */
    private static Trade createTrade() {
        Trade trade = new Trade();
        System.out.println("请输入交易标号");
        // 假设交易标号是
        trade.setTradeNo("abc323232324");

        // 假设交易金额是
        trade.setAmount(400);

        return trade;
    }

    private static void showCard(Card card) {

    }

    private static Card initIC() {
        Card card = new Card();
        card.setCardNo("10000000000000");
        card.setFreeMoney(100000);
        card.setSteadyMoney(8000);

        return card;
    }
}

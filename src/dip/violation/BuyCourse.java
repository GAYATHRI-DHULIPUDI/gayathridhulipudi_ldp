package dip.violation;

public class BuyCourse {
    BuyWishlist wishList;
    BuyCourse(BuyWishlist watchlist){
        this.wishList=watchlist;
    }
    public void purchaseCourse(){
        wishList.buyWatchlistCourse();
    }

    public static void main(String[] args) {
        BuyCourse buy=new BuyCourse(new BuyWishlist());
        buy.purchaseCourse();
    }
}

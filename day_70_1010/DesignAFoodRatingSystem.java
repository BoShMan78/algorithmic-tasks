// https://leetcode.com/problems/design-a-food-rating-system/submissions/1418116535/

class FoodRatings {
    Map<String, Integer> foodRatingMap = new HashMap<>();
    Map<String, TreeSet<String>> cuisineFoodMap = new HashMap<>();
    Map<String, String> foodCuisineMap = new HashMap<>();
    Comparator<String> foodComparator = (food1, food2) -> {
        int rating1 = foodRatingMap.get(food1);
        int rating2 = foodRatingMap.get(food2);
        if (rating1 != rating2) {
            return Integer.compare(rating2, rating1);
        } else {
            return food1.compareTo(food2);
        }
    };

    public FoodRatings(String[] foods, String[] cuisines, int[] rating) {
        for (int i = 0; i < foods.length; i++) {
            foodRatingMap.put(foods[i], rating[i]);
            foodCuisineMap.put(foods[i], cuisines[i]);
            cuisineFoodMap.putIfAbsent(cuisines[i], new TreeSet<>(foodComparator));
            cuisineFoodMap.get(cuisines[i]).add(foods[i]);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisineMap.get(food);
        TreeSet<String> foodSet = cuisineFoodMap.get(cuisine);
        foodSet.remove(food);
        foodRatingMap.put(food, newRating);
        foodSet.add(food);
    }

    public String highestRated(String cuisine) {
        return cuisineFoodMap.get(cuisine).first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */

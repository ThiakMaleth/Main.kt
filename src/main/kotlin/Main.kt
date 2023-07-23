/*
  A person has four option of choosing between; pizza, chicken, pancakes or cake.
  If they choose pizza, they'll go to pizza hut, if chicken, they'll go to kfc,
  if pancakes, they'll go to food hub, if caked, they'll go to cakey.
  Write a program using:
     * An if statement that captures the persons choice and prints the
  selected restaurant
     * Same program using a when statement
*/

fun main(){

    print("Enter the Food Type: ")
    val foodType = readln().toString()

    if(foodType == "pizza") {
        println("They'll go to pizza Hut")
        }
    else if (foodType == "chicken") {
        println("They'll go to KFC")
    }
    else if (foodType == "pancake") {
        println("They'll go to FoodHub")
    }
    else if (foodType == "cake"){
        println("They'll go to Cakey")
    }
    else {
        println("None of the above")
        }
}
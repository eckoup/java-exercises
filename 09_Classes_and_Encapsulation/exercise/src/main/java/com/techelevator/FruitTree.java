package com.techelevator;

public class FruitTree {
   private String typeOfFruit;
   private int piecesOfFruitLeft;

   public void FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
      this.typeOfFruit = typeOfFruit;
      this.piecesOfFruitLeft = startingPiecesOfFruit;

   }
      //pick fruit method
      public boolean FruitTree (int piecesOfFruitLeft, int numberOfPiecesToRemove){
         if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
         } else {
            return false;
         }
      }
         public String getTypeOfFruit() {
            return typeOfFruit;
         }
         public int getPiecesOfFruitLeft() {
            return piecesOfFruitLeft;
         }
      }


//for (int runX=0; runX <= Integer.parseInt(args[1]); runX++) { //how many times to run experiement
//        
//        for (int j=0; j < Integer.parseInt(args[0]); j++) { //run a single experiement
//          int[] guesses = new int[5];
//          for (int i =0; i<guesses.length; i++) {//fill array of guesses
//            guesses[i] =  generator.nextInt(36) + 1;
//            for (int k=0; k < i; k++) { //make sure there are no repeates guesses
//              while (guesses[i] == guesses[k]) 
//                guesses[i] = guesses[i] =  generator.nextInt(36) + 1;
//            }
//          }
//          
//          int spin = generator.nextInt(36) + 1;
//          
//          for (int i=0; i<guesses.length; i++) {//check if guesses are correct
//            if (spin == guesses[i]){ 
//              currentCount++;
//              break;
//            }
//          }
//        }
//        if (currentCount > 0) //update total times won
//          masterCount++;
//        currentCount = 0;
//      }
//      System.out.println("Experiemental Average of winning when playing " + Integer.parseInt(args[0]) + " times: " +
//                         (masterCount * 1.0) / Integer.parseInt(args[1])); 
//    }
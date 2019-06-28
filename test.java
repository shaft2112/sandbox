
public void deselectToken(IToken token) {
    if(selectedTokenOne==token || selectedTokenTwo == token){
    token.setTokenState(Tokenstate.DEFAULT);
    }
}


public void deselectTokens() {
  deselectToken(selectedTokenOne);
  deselectToken(selectedTokenTwo);
}

public boolean isSolved(){
  for (int i = 0; i =< token[id]; i++){

    if(token[id].tokenState != TokenState.SOLVED)
    return false;
  }
  return true;
}
public boolean isSolvedWhileLoop(){
  while(true){
  if(token.id == null){
    break;
  }
  if(token.tokenState != TokenState.SOLVED){
    return false;
  }

}
  return true;
}

../assets/map001.map

//3h
String grid = readFile(bla);
int gridcounter = 0;
for(int i = 0; i =< 10; i++){
  for int j = 0; j =< 20; j++){
    IToken token = new IToken;
    token.pos = [i][j];
    if(token.pos[i] != 0 || token.pos[i] != 10 || token.pos[j] != 0 || token.pos[j] != 20){
    token.setTokenState(TokenState.DEFAULT);
    token.value = grid[gridcounter];
    gridcounter = gridcounter + 1;
      }
      token.setTokenState(TokenState.SOLVED);
      token.value = grid[gridcounter];
      gridcounter = gridcounter + 1;
  }
}

//4.1a
if(date == null || LocalDateTime == null){
   throw new IllegalArgumentException("Datum leer, du depp");
}

if(score < 0 || score > 1000){
   throw new IllegalArgumentException("Score muss positiv sein, du depp");
}

if(duration < 0){
   throw new IllegalArgumentException("bist du flash? schneller als 0 geht nicht...");
}

//4.1b

if (validate(date, score, duration)){
  new HighscoreEntry entry;
  entry.date = date;
  entry.score = score;
  entry.duration = duration;
}

//4.1c
input string
if(data == null){
   throw new IllegalArgumentException("Kein String");
}

for(int i = 0; i =< string.length(); i++)
if(!stuff){
 throw new IllegalArgumentException("n must be positive");
  }
 validate(date, score duration);


//4.1d
if(obj == null){
   throw new IllegalArgumentException("n must be positive");
}
if(obj != instanceof HighscoreEntry){
   throw new IllegalArgumentException("n must be positive");
}

if(HighscoreEntry.date != obj.date){
  return false
}
if(HighscoreEntry.score != obj.score){
  return false
}if(HighscoreEntry.duration != obj.duration){
  return false
}
return true;

//4.2 a)
public void addEntry(HighscoreEntry entry){
  highscores.add(entry);
  HighscoreEntry helper = new HighscoreEntry(null, null, null);
  for (int i = 0; i <= highscores.length(); i++){
    for (int j = 0; j <= highscores.length(); j++){
      //maybe use list.get(i) and so on
      //https://stackoverflow.com/questions/8121176/java-sort-array-list-using-bubblesort
      if(highscores[i].compareTo(highscores[j]) < 0){
        //stuff
        helper = highscores[j];
        highscores[j] = highscores[j+1];
        highscores[j+1] = helper;
        }
      }
    }
    if(highscores.length() => 10){
      highscores = Arrays.copyOf(highscores, 9);
    }
  }


  public void saveToFile(String fileName){
    if(highscores == null){
      throw new IllegalArgumentException("No Highscore available! =(")
    }
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i <= highscores.length(); i++){
    builder.append(highscores[i].date.toString());
    builder.append(highscores[i].score.toString());
    builder.append(highscores[i].duration.toString());
    builder.append(System.lineSeperator());
    }
    writeFileTo(fileName, builder);
  }


//5.1 c)
  private static List<Token> findTokensWithType(final IToken token, final Grid grid){
    List<Token> returnList;
    for (int i = 0; i <= grid.length(); i++){
      if(grid[i].value == token.value){
        if(grid[i].tokenState != TokenState.SOLVED){
          returnList.add(grid[i]);
        }
      }
    }
    return Collections.shuffle(returnList);
  }

//5.1 d
  public static void solvePair(final Grid grid){
    if(isCheatPossible(grid, 0)){
      List<Token> tokenPair = findValidTokens(grid);
      deselectTokens();
      if(tokenPair.length == 1){
        tokenPair[0].setTokenState(TokenState.CLICKED);
        tokenPair[1].setTokenState(TokenState.CLICKED);
        grid.updateScore(-5);
      }
      grid.updateScore(-20);
    }
  }

public static void findPartner(final Grid grid){
  if(!(selectedTokenOne.TokenState == TokenState.CLICKED && selectedTokenTwo.TokenState == TokenState.CLICKED ||
  selectedTokenOne.TokenState == TokenState.DEFAULT && selectedTokenTwo.TokenState == TokenState.DEFAULT)){
    if(isCheatPossible(grid, 2)){
      grid.updateScore(-10);
      IToken single;
      if(selectedTokenOne.TokenState == TokenState.CLICKED){
        single = selectedTokenOne;
      } else {
        single = selectedTokenTwo;
      }
      List<Token> matchingPartners = findTokensWithType(single, grid);
      for(int i = 0; i =< matchingPartners.length(); i++){
        if(solvable(single, matchingPartners[i], grid)){
          selectedTokenOne = single;
          selectedTokenTwo = matchingPartners[i];
          break;
        } else {
          selectedTokenOne = single;
          selectedTokenTwo = matchingPartners[i];
        }
      }
      if(!(solvable(selectedTokenOne, selectedTokenTwo, grid))){
        grid.updateScore(-1);
      }
      selectedTokenOne.setTokenState(TokenState.CLICKED);
      selectedTokenTwo.setTokenState(TokenState.CLICKED);
      grid.updateScore(-5);
    }
  }
}

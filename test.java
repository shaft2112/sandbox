
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

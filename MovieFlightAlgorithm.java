const findmovies = (moviesLengths, flightLength) => {
const hashmovies = new Set();

for(let i = 0; i < moviesLengths.length; i++) {
let match = flightLength - moviesLength[i];
if(hashmovies.has(match)){
return true;
}
hashmovies.add(moviesLengths[i]);
}
return false;
};


                                                                                                                                                                                                        
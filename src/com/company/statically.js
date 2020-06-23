class Statically {

   glue = "Epoxy";
jello = "Jello";

    moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }
static explain() {
        stubborn();
        console.log(this.glue);
        console.log('static is the same as adding it to the class and in java it is different. I dont really understand')
    }

}
 function stubborn() {
        stats.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

const stats = new Statically();

stats.moveAndShake();
stubborn();
console.log(Statically.explain());

console.log(stats.glue);
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.

use(function (){

    var a= this.a; // this current object
    var b = this.b;


 var multy= function multiply(){
     var z = a * b ;
     return z;

    };


    return {
        multy : multy
    };


});
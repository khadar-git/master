use(function(){


	var props1 = granite.resource.properties["bookName"];
    var props2 = granite.resource.properties["author"];
    var props3 = granite.resource.properties["number1"];
    var props4 = granite.resource.properties["number2"];

    var pageName = currentPage.name;
    var pagePth = currentPage.path;


  	var total=  function add(){

        var z = props3 + props4;

      return z ;

    }

    var sub= function sub(){

         return props3 - props4; 
    }


    return {

       	 props1:props1,
         props2:props2,
         props3:props3,
         props4:props4,
         total :total,
         sub : sub,
       	 path:pagePth,
         name:pageName


    };






});
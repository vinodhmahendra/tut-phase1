Java Methods
--------------------------------------------------------------
syntax :

<modifier>* <return-type> method_name() {
 //statements
}

<modifier>* <return-type> method_name(<arguments>*) {
 //statements
}

public void eat() {
   // can i write a explicit return statement? yes /no
   /Answer : yes
   return ; // javac automatically provides an implicit return statement for void methods
}
//drawing.js
window.addEventListener("load", function() {

	var canvas;
	var context;
	var strokeSize = 1;
	var strokeStyle = '#00FFFF';
	var bgColor = '#0000ff';
	var mouse = {};
	var lineWidth;
	
	canvas = document.getElementById('canvas');
    context = canvas.getContext('2d');
    context.strokeStyle = 'black';

    canvas.addEventListener("mousedown", function() {
    	console.log(event);
    	context.beginPath();
    	context.moveTo(event.offsetX, event.offsetY)
    	canvas.addEventListener("mousemove", myMouseMove, false);
    }, false);

    

    canvas.addEventListener("mouseup", function() {
    	console.log(event);

    	canvas.removeEventListener("mousemove", myMouseMove);

    	context.lineTo(event.offsetX, event.offsetY);
    	//context.closePath;
    	
    }, false);

    function myMouseMove(){
    	console.log("mouse moving", event);
    	context.lineTo(event.offsetX, event.offsetY);
    	context.lineWidth = 5;
    	context.stroke();
    }

	/*add code here to create a drawing app.
	1. add mousedown, mouseUp eventListeners.
	2. When the mouse is pressed down add an eventListener
	that starts drawing a line on the canvas
	3. When the mouse is up remove the mouse move eventListener,
	finish the path, and apply a stroke.
	
	Note: In order to get your coordinates on the canvas use the
	getMouse(e) utility function.
	*/	

    //utility function to get the Mouse position
    function  getMouse(e) {
    	e = e || event;
	    var rect = this.canvas.getBoundingClientRect();
	        return {
	          x: e.clientX - rect.left,
	          y: e.clientY - rect.top
			}
	}
}, false);	
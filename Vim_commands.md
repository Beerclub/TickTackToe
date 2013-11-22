#--- QUIT AND SAVE IN COMMAND MODE ---

:q	= quit
 
:q!	= quti without saving

:wq	= write and quit

:qa	= quit all

:w	= save

:x 	= save and exit if changes have been made



#--- MODES ---
esc	= command mode
i	= insert mode
I	= moves to beginning of line and goes to insert mode
o	= insert a new line in the line below and goes to insert mode
O	= insert a new line in the line abowe and goes to insert mode
a	= moves forward one char and goes into insert mode
A	= moves to the end of the line and goes to insert mode


#--- MOVE IN COMMAND MODE ---
j	= move down
k	= move up
h	= move left
H	= jump to top of screen
l	= move right
L	= jump to bottom of screen
M	= jump to middle of screen
b	= move back to the next word or .
*b	= moves back * number of words
w	= move forward to the next word or .
*b	= moves forward * number of words
0	= go to beginning of line
shi + 4 = go to end of line

 
#--- COPY/PASTE IN COMMAND MODE ---
yy	= copy whole line
p	= paste in new line
*p	= (* = number, f.ex. 5p) pastes the copyed line * number of times


#--- TEXT EDITING ---
J	= join line with the one below it
.	= repeat last command


#--- DELETE ---
dd	= delete line
*dd	= same as *p except it delets * number of lines (current and lines below)
db	= delets one word to the left
dw	= delets one word to the right

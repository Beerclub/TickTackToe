#Development manual
 
That is, what is needed and how to get the project to build on a
fresh machine
Source control client and access to source control Build environment
Other necessary dependencies	

##Ur fyrirlestri:
ef nýr aðili kemur inn í teymið, hvað þarf hann að gera á sinni endavél til að geta byrjað að vinna.
aðgangur að github, geta sótt kóðann, kunna á þær script-ur sem eru í gangi, hvaða test eru í gangi og hvert á hann að setja þau, er eitthvað sem hann þarf að deploy-a.
hann þarf að setja upp github client, hann þarf að setja upp maven, það þarf að vera einhver ákveðin útgáfa af java
lýsa öllu þessu

Install the Heroku toolbelt:
wget -qO- https://toolbelt.heroku.com/install-ubuntu.sh | sh

Install ruby1.9.1-dev and update make
sudo apt-get install -y make ruby1.9.1-dev

Use gem1.9.1 to install travis
sudo gem1.9.1 install travis 

All our tests are saved in TicTacToe/src/test/java/bjorklubburinn/tictactoe/ folder. 

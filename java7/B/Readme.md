Open Terminal from Application Dash or press Ctrl+Alt+T

Update repository:

sudo add-apt-repository ppa:openjdk-r/ppa  # only Ubuntu 17.4 and earlier
sudo apt update

Optional: To search available distributions of openjdk, use the following command:

apt search openjdk

Install the appropriate version with the following command:

sudo apt install openjdk-8-jdk
sudo apt install openjdk-8-source #this is optional, the jdk source code
For JAVA_HOME (Environment Variable) type command as shown below, in "Terminal" using your installation path...

export JAVA_HOME=/usr/lib/jvm/java-8-openjdk
(Note: /usr/lib/jvm/java-8-openjdk is symbolically used here just for demostration. You should use your path as per your installation.)

For PATH (Environment Variable) type command as shown below, in Terminal:

export PATH=$PATH:$JAVA_HOME/bin

To check your installation:

java -version

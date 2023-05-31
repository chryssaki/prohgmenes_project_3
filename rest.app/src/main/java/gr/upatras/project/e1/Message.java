package gr.upatras.project.e1;

public class Message {
	public String myString;
	 public Message(String myString) {
	 super();
	 this.myString = myString;
	 }

	 public void publish() {
		 MyMqttClient client = new MyMqttClient();
		 client.runClient(this);
		}

}
# NDEF Editor for NFC Tags 

A web based [NDEF Editor tool](http://ndefeditor.com).  Useful for Android devices when empowered by the NFC Developer Android App.  Users can scan QR Codes of NDEF records which can be converted into intents then written to NFC Tags.

## Installation
```
apt-get install tomcat6 maven2 openjdk-6 git
git clone git://github.com/grundid/ndefeditor.git
cd ndefeditor
mvn package
cp target/*.war /var/lib/tomcat6/webapps/
```
Visit http://127.0.0.1:8080/ndefeditor

## Contributing
Contributing guidelines will be available soon, for now please use the standard git flow model.

## License
GNU Affero (yep we're crazy) license.

## Contributors
* Author, Adrian Stabizewski @ Grundid
* Contributor, John McLear @ Rung

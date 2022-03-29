mvn clean package
mkdir deploy
mkdir deploy/engine
cp engine-app.yaml deploy/engine/app.yaml
cp engine/target/*.jar deploy/engine
mkdir deploy/ui
cp ui-app.yaml deploy/ui/app.yaml
cp ui/target/*.jar deploy/ui
gcloud app deploy deploy/engine/app.yaml deploy/ui/app.yaml --quiet
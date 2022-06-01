# cursolinkejemplo
Un ejercicio de correlativas

docker run --rm --detach --name correlativas_db --env MARIADB_DATABASE=correlativas_db --env MARIADB_USER=user --env MARIADB_PASSWORD=123 -p 3306:3306 --env MARIADB_ROOT_PASSWORD=123 -v $PWD/db:/var/lib/mysql -it mariadb:jammy

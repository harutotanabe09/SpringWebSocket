### :green_book: Application Name

Spring Boot WebSocket

### :blue_book: Description

| Label            | Description |
| ---------------- | ----------- |
| Program languege | Java 15     |

### :notebook: How to Begin

:orange:  Java Install

``
gradle bootRun
``

:apple:  Java Build

crated jar file

``
gradle build
``

### :star2: Reccomad Editor

Intelli J

- Settings > Build, Excecution, Deployment > Compiler > Annotation Processor > `Enable Annotation Processing`
- Intellij > Ctrl+Shift+A > type Registry... > `compiler.automake.allow.when.app.running`
- http://livereload.com/extensions/

### :books: TODO

- [x] Doma導入
- [x] コードチェック
- [x] 自動コード整形
- [x] DBパスワード暗号化
- [x] Javaコンパイルチェック pre commit
- [x] テストクラス作成

### :man: DB Start

``
docker run -d --name postgres -e POSTGRES_PASSWORD=test -p 5432:5432 postgres
``

- default user : postgres

### :star: libraries

| library Name | Descritption |
| :---------------------------------------| :-------------------------------|
| [Springframework](https://projects.spring.io/spring-framework/)| Framework |
| [WebJars](https://www.webjars.org/)| JavaScript Library |
| [Spotless](https://github.com/diffplug/spotless/tree/master/plugin-gradle) | Code Formmatter |
| [Lombok Project](https://projectlombok.org/) | Java Beans Library |

### Referer

https://github.com/miyabayt/spring-boot-doma2-sample

### Point

- [ ] Gradleに最新のバージョンをセット
- [ ] Migrationを使ったSQLファイル
- [ ] SpotlessCheckでコード自動生成
- [ ] 汎用のEntityクラス
- [ ] 暗号化スクリプトのテスト
- [ ] 課題：pre-commitは権限必要。(chmod ug+x .git/hooks/*)

### IDE

- [ ] パッケージ名を一括リネーム
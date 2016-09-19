# A SBT plugin for CXF to generate java sources from WSDL using WSDL2Java [![Build Status](https://travis-ci.org/stonexx/sbt-cxf.svg?branch=master)](https://travis-ci.org/stonexx/sbt-cxf)

Installation
------------

To use this plugin use the addSbtPlugin command within your project's `plugins.sbt` file:

```scala
addSbtPlugin("com.github.stonexx.sbt" % "sbt-cxf" % "0.2.4")
```

For example with `build.sbt`:

```scala
CxfKeys.wsdls += Wsdl("example", "http://example.com/service?wsdl")
```

Run the following at the sbt console:
```scala
show cxfWsdl2java
```

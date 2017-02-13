# @PaniniJ Setup Examples

This repository contains a variety of ways to build a small @PaniniJ
application. Each example demonstrates how you might configure your development
to get started developing @PaniniJ programs. In every case, the idea is simple:

- Add `org.paninij:lang` as a compile/runtime dependency.
- Add `org.paninij:proc` as a dependency and enabling the annotation processor.

The former is easy. The latter can be confusing in some cases, since different
environments may enable annotation processing in different ways.

The trickiest part of configuring a development environment is usually just
getting the IDE to shows the effects of the annotation processor (i.e. compile
errors and generated source files).

By comparison, getting integration with one of the command line tools is easy.
It is usually done by just adding `org.paninij:proc` as a dependency. Once this
is done, the annotation processor will be automatically triggered appropriately
upon every compilation.

See the other `README.md` files for more details.

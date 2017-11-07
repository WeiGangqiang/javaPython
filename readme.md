##JavaPython环境配置

###第一步

从官网下载并安装 jython-installer-2.7.0.jar
建议安装完全模式。

###第二步

进入到jython 的安装目录，并且使用bin目录下面的pip安装requests包，这里需要了解是jython和python使用相同的仓库地址，使用相同的包。

###第三步

修改工程目录下面的jythonPath.properties中的配置为jython的lib和sitepackage路径。

###第四步

使用系统中的python运行脚步restServer.py
如下所示：
``` python restServer.py

###第五步

运行JythonTest即可
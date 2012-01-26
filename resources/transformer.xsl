<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <additionalAttributes>
            <xsl:for-each select="ADDITIONALATTRIBUTES/NAME">
                <nameValuePair>
                    <name><xsl:value-of select="current()"/></name>
                    <value><xsl:value-of select="following-sibling::VALUE" /></value>
                </nameValuePair>
            </xsl:for-each>
        </additionalAttributes>
    </xsl:template>
</xsl:stylesheet>
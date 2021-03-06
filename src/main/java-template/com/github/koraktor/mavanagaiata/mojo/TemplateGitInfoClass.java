/**
 * Generated by Mavanagaiata ${MAVANAGAIATA_VERSION} at ${TIMESTAMP}
 */

package ${PACKAGE_NAME};

public final class ${CLASS_NAME} {

    public static final String BRANCH = "${BRANCH}";

    public static final String COMMIT_ABBREV = "${COMMIT_ABBREV}";

    public static final String COMMIT_SHA = "${COMMIT_SHA}";

    public static final String DESCRIBE = "${DESCRIBE}";

    public static final boolean DIRTY = ${DIRTY};

    public static final String TAG = "${TAG_NAME}";

    public static final String VERSION = "${VERSION}";

    public static String getVersion() {
        if (TAG.equals(VERSION) && TAG.equals(DESCRIBE)) {
            return TAG;
        }

        return String.format("%s (%s)", VERSION, DESCRIBE);
    }

}

******

### 버전 역사

******

# v6.6.0

###### 2024/12/02 - 내장 모듈 재작성, 신중한 업그레이드 필요

* `힌트` 기존 모듈이 스크립트 실행 효율성을 높이기 위해 Kotlin으로 재작성되었으나, 개선을 위한 몇 가지 반복이 필요합니다
* `힌트` 내장된 init.js 파일은 기본적으로 비어 있지만, 개발자가 사용자 정의를 위해 모듈을 마운트할 수 있습니다
* `추가` axios 모듈 / cheerio 모듈 ([AutoX](https://github.com/kkevsekk1/AutoX) 참조)
* `추가` sqlite 모듈, SQLite 데이터베이스 간단 조작에 사용됩니다 ([Auto.js Pro](https://g.pro.autojs.org/) 참조) (프로젝트 문서 > [SQLite](https://docs.autojs6.com/#/sqlite) 참조)
* `추가` mime 모듈, MIME 유형 문자열을 처리하고 구문 분석하는 데 사용됩니다 (프로젝트 문서 > [MIME](https://docs.autojs6.com/#/mime) 참조)
* `추가` nanoid 모듈, 문자열 ID 생성기로 사용할 수 있습니다 ([ai/nanoid](https://github.com/ai/nanoid) 참조)
* `추가` sysprops 모듈, 런타임 환경의 구성 데이터를 얻는 데 사용됩니다 (프로젝트 문서 > [시스템 속성](https://docs.autojs6.com/#/sysprops) 참조)
* `추가` ocr 모듈은 [Rapid OCR](https://github.com/RapidAI/RapidOCR) 엔진을 지원합니다
* `추가` 레이아웃 분석은 창 전환을 지원합니다 (Auto.js Pro
* `추가` auto.clearCache 메소드는 제어 캐시를 지우는 것을 지원합니다 (Auto.js Pro
* `추가` threads.pool 메소드는 간단한 스레드 풀 응용 프로그램을 지원합니다 (Auto.js Pro
* `추가` images.matchTemplate 메소드는 useTransparentMask 옵션 매개변수를 추가하여 투명 이미지 검색을 지원합니다 (Auto.js Pro
* `추가` images.requestScreenCaptureAsync 메소드는 UI 모드에서 비동기적으로 스크린 캡처 권한을 요청하는 데 사용됩니다  (Auto.js Pro
* `추가` images.requestScreenCapture 메소드는 isAsync 옵션 매개변수를 추가하여 비동기적으로 스크린 캡처를 획득하는 것을 지원합니다 (Auto.js Pro
* `추가` images.on('screen_capture', callback) 등의 이벤트 리스닝 메소드는 스크린 캡처가 사용 가능 이벤트를 모니터링하는 것을 지원합니다 (Auto.js Pro
* `추가` images.stopScreenCapture 메소드는 스크린 캡처 요청과 관련된 리소스를 적극 해제하는 것을 지원합니다 (Auto.js Pro
* `추가` images.psnr/mse/ssim/mssim/hist/ncc 및 images.getSimilarity 메소드는 이미지 유사성 측정값을 얻는 데 사용됩니다
* `추가` images.isGrayscale 메소드는 이미지가 그레이스케일인지 여부를 결정하는 데 사용됩니다
* `추가` images.invert 메소드는 이미지의 색상을 반전하는 데 사용됩니다
* `추가` s13n.point/time 메소드는 포인트 객체와 시간 객체를 정규화하는 데 사용됩니다 (프로젝트 문서 > [정규화](https://docs.autojs6.com/#/s13n) 참조)
* `추가` console 모듈의 gravity (중력), touchThrough (터치 스루), backgroundTint (배경 색조) 등의 관련 메소드 (프로젝트 문서 > [콘솔](https://docs.autojs6.com/#/console) 참조)
* `추가` Mathx.randomInt/Mathx.randomFloat 메소드는 주어진 범위 내의 난수 또는 랜덤 부동 소수점을 반환하는 데 사용됩니다
* `추가` app.launchDual/startDualActivity 등의 메소드는 듀얼 실행 애플리케이션 처리를 위해 사용됩니다 (Shizuku 또는 Root 권한이 필요) (실험적)
* `추가` app.kill 메소드는 애플리케이션을 강제로 종료하는 데 사용됩니다 (Shizuku 또는 Root 권한이 필요)
* `추가` floaty.getClip 메소드는 플로팅 창의 포커스를 통해 클립보드 내용을 간접적으로 얻는 데 사용됩니다
* `수정` Fragment 하위 클래스 (예: [DrawerFragment](https://github.com/SuperMonster003/AutoJs6/blob/17616504ab0bba93b30ab7abc67108ee5253f39a/app/src/main/java/org/autojs/autojs/ui/main/drawer/DrawerFragment.kt#L369) / [ExplorerFragment](https://github.com/SuperMonster003/AutoJs6/blob/17616504ab0bba93b30ab7abc67108ee5253f39a/app/src/main/java/org/autojs/autojs/ui/main/scripts/ExplorerFragment.kt#L48) 등) 내의 View Binding 메모리 누수
* `수정` [ScreenCapture](https://github.com/SuperMonster003/AutoJs6/blob/17616504ab0bba93b30ab7abc67108ee5253f39a/app/src/main/java/org/autojs/autojs/core/image/capture/ScreenCapturer.java#L70) / [ThemeColorPreference](https://github.com/SuperMonster003/AutoJs6/blob/10960ddbee71f75ef80907ad5b6ab42f3e1bf31e/app/src/main/java/org/autojs/autojs/ui/settings/ThemeColorPreference.kt#L21) 등의 클래스 내의 인스턴스 메모리 누수
* `수정` Android 14+에서 스크린 캡처 권한을 요청할 때 앱이 충돌하는 문제 (by [chenguangming](https://github.com/chenguangming)) _[`pr #242`](http://pr.autojs6.com/242)_
* `수정` Android 14+에서 포어그라운드 서비스를 시작할 때 앱이 충돌하는 문제
* `수정` Android 14+에서 코드 에디터에서 실행 버튼을 클릭해도 점등되지 않는 문제
* `수정` 프로젝트 패키징 후 필요한 라이브러리 파일이 부족하여 앱이 정상적으로 실행되지 않을 수 있는 문제 _[`issue #202`](http://issues.autojs6.com/202)_ _[`issue #223`](http://issues.autojs6.com/223)_ _[`pr #264`](http://pr.autojs6.com/264)_
* `수정` 프로젝트 편집 시 지정된 아이콘 리소스가 없는 경우 앱이 충돌하는 문제 _[`issue #203`](http://issues.autojs6.com/203)_
* `수정` 스크린 캡처 권한 획득 시 지정된 화면 방향의 스크린샷 리소스를 매개변수로 얻지 못할 수 있는 문제
* `수정` 일부 기기에서 스크립트 바로가기를 정상적으로 추가할 수 없는 문제 (시도 수정) _[`issue #221`](http://issues.autojs6.com/221)_
* `수정` http 모듈 및 관련 메소드를 호출할 때 축적된 요청으로 인해 전송 지연이 발생하는 문제 _[`issue #192`](http://issues.autojs6.com/192)_
* `수정` AutoJs6가 메인 액티비티 페이지에 들어가기 전에 Shizuku 서비스가 정상적으로 사용할 수 없는 문제 (시도 수정) _[`issue #255`](http://issues.autojs6.com/255)_
* `수정` random(min, max) 메소드에서 결과가 오버플로우할 가능성이 있는 문제
* `수정` pickup 메소드의 결과형 매개변수가 빈 배열을 올바르게 전달할 수 없는 문제
* `수정` UiObject#bounds()에서 얻은 컨트롤 경계가 의도와 다르게 변경될 수 있는 문제
* `수정` text/button/input 요소의 텍스트 내용에 하프 사이즈의 이중 따옴표가 포함된 경우 올바르게 구문 분석되지 않는 문제
* `수정` text/textswitcher 요소의 autoLink 속성이 작동하지 않는 문제
* `수정` 다른 스크립트가 동일한 ScriptRuntime 객체를 잘못 공유할 가능성이 있는 문제
* `수정` 전역 변수 HEIGHT 및 WIDTH가 Getter 동적 속성을 잃는 문제
* `수정` 스크립트 시작 시 RootShell이 즉시 로드되어 시작이 느려지는 문제
* `수정` 콘솔 플로팅 창에서 배경색을 설정하면 사각형의 모서리가 사라지는 문제
* `수정` 서비스 이상 문제를 일으킬 수 있는 접근성 서비스의 자동 시작 (시도 수정)
* `수정` 홈페이지의 문서 페이지에서 왼쪽 또는 오른쪽으로 이동할 때 WebView 컨트롤이 ViewPager 전환을 유발할 수 있는 문제
* `수정` 파일 확장명이 대문자를 포함하는 경우 파일 관리자에서 인식하지 않는 문제
* `수정` 파일 관리자가 프로젝트 디렉토리에 처음 들어갔을 때 프로젝트를 자동으로 인식하지 못할 수 있는 문제
* `수정` 파일 관리자에서 폴더를 삭제 후 페이지가 자동 갱신되지 않는 문제
* `수정` 파일 관리자에서 파일 및 폴더를 정렬할 때 ASCII의 선행 문자명을 멀리 두는 문제
* `수정` 코드 편집기의 디버그 기능에서 FAILED ASSERTION 예외 발생
* `수정` 코드 편집기에서 디버그 중 편집기를 닫은 후 다시 정상적으로 디버그할 수 없는 문제
* `수정` 코드 편집기에서 행의 끝으로 이동할 때 끝 문자 누락 가능성 있는 문제
* `수정` 메인 액티비티 페이지에서 로그 액티비티 페이지를 실행할 때 플래시 스크린 문제 발생 가능성
* `수정` 앱 패키지가 opencc 모듈을 정상적으로 사용할 수 없는 문제
* `개선` 패키지 페이지 내 '사용 불가 ABI' 컨트롤의 클릭 힌트 사용자 경험
* `개선` Shizuku를 사용하여 '포인터 위치' 디스플레이 스위치를 제어하는 것을 지원
* `개선` Shizuku를 사용하여 '미디어 프로젝션' 및 '보안 설정 수정' 권한 스위치를 제어하는 것을 지원
* `개선` automator.gestureAsync/gesturesAsync가 콜백 함수 매개변수를 지원
* `개선` tasks 모듈이 동기화 방식으로 데이터베이스 작업을 수행하는 것을 지원, 데이터 액세스의 불일치 문제 방지
* `개선` 스크립트 실행 모드가 파이프 기호로 구분된 모드 매개변수 (예: 'ui|auto';처럼 시작)를 지원
* `개선` 스크립트 실행 모드가 싱글 쿼테이션 및 백틱을 지원하여 세미콜론 생략 (예: 'ui'; 또는 'ui'처럼 시작) 가능
* `개선` 스크립트 실행 모드가 axios, cheerio, dayjs 등의 모드 매개변수로 내장 확장 모듈의 빠른 가져오기를 지원 (예: 'axios';처럼 시작)
* `개선` 스크립트 실행 모드가 x 또는 jsox 모드 매개변수로 JavaScript 내장 객체 확장 모듈의 빠른 활성화를 지원 (예: 'x';처럼 시작)
* `개선` img 요소의 src 및 path 속성이 로컬 상대 경로를 지원 (예: '<img src="a.png" />'처럼)
* `개선` 코드 편집기에서 Java 클래스나 패키지명을 가져오는 위치의 지능형 판단을 지원
* `개선` images 모듈이 이미지 매개변수로 경로의 직접 사용을 지원
* `개선` importPackage가 문자열 매개변수를 지원
* `개선` 서버 모드의 IP 주소가 클립보드 가져오기를 스마트하게 인식하고, 스페이스 키 스마트 변환을 지원
* `개선` 파일 관리자가 새 파일을 생성할 때 기본 접두사 선택 및 적절한 숫자 접미사의 자동 생성을 지원
* `개선` 파일 관리 프로젝트 실행 시 예외 메시지 구체화 _[`issue #268`](http://issues.autojs6.com/268)_
* `개선` 파일 관리자가 더 많은 유형을 지원하고, 해당 아이콘 심볼을 표시 (800 이상의 파일 타입 지원)
* `개선` 파일 관리자에서 편집 가능한 파일 타입(jpg/doc/pdf...)에 편집 버튼 추가
* `개선` 파일 관리자가 APK 파일의 기본 정보, Manifest 정보 및 권한 목록을 표시하는 것을 지원
* `개선` 파일 관리자가 오디오 및 비디오 같은 미디어 파일의 기본 정보 및 MediaInfo 정보를 표시하는 것을 지원
* `개선` 단일 파일 패키징 시 적절한 정규화 이름 패키지를 자동 입력하며, 유효하지 않은 문자 필터링을 권장
* `개선` 단일 파일 패키징 시 동일한 패키지 이름의 앱이 설치된 경우 아이콘을 자동 설정하고, 버전 번호와 버전명을 증가시키는 것을 지원
* `개선` 패키지 프로젝트 설정 파일이 abis/libs 옵션을 지원하고, 기본적으로 포함되는 ABI 아키텍처와 확장 라이브러리를 지정
* `개선` 패키지 프로젝트 설정 파일의 abis/libs 옵션이 무효하거나 사용할 수 없을 때 관련 메시지를 지원
* `개선` 불필요한 증가 방지를 위해 릭 캐너리를 릴리스 버전에서 제외
* `개선` 프로젝트 소스 코드 내 모든 영어 주석에 한국어 번역 추가하여 읽기 쉬운 주석 개선
* `개선` README 및 CHANGELOG에 여러 언어 지원 (스크립트를 통한 자동 생성)
* `개선` Gradle 빌드 스크립트의 버전 적응 능력을 개선
* `의존성` MIME Util 버전 2.3.1 추가
* `의존성` Toaster 버전 12.6 추가
* `의존성` EasyWindow (for Toaster) 버전 10.3 추가
* `의존성` Gradle 버전 8.5 -> 8.11.1 업그레이드
* `의존성` Rhino 버전 1.7.15-snapshot에서 1.7.16-snapshot으로 업그레이드
* `의존성` Android Material Lang3 버전 1.10.0에서 1.12.0으로 업그레이드
* `의존성` Androidx Annotation 버전 1.7.0에서 1.9.1으로 업그레이드
* `의존성` Androidx AppCompat 버전 1.6.1에서 1.7.0으로 업그레이드
* `의존성` Androidx WebKit 버전 1.8.0에서 1.12.1으로 업그레이드
* `의존성` Apache Commons 버전 3.13.0에서 3.16.0으로 업그레이드
* `의존성` ARSCLib 버전 1.2.4에서 1.3.1으로 업그레이드
* `의존성` Gson 버전 2.10.1에서 2.11.0으로 업그레이드
* `의존성` Jackson DataBind 버전 2.13.3에서 2.13.4.2로 업그레이드
* `의존성` Joda Time 버전 2.12.5에서 2.12.7로 업그레이드
* `의존성` LeakCanary 버전 2.12에서 2.14로 업그레이드
* `의존성` MLKit Barcode Scanning 버전 17.2.0에서 17.3.0으로 업그레이드
* `의존성` MLKit Text Recognition Chinese 버전 16.0.0에서 16.0.1로 업그레이드
* `의존성` Retrofit2 Converter Gson 버전 2.9.0에서 2.11.0으로 업그레이드
* `의존성` Retrofit2 Retrofit 버전 2.9.0에서 2.11.0으로 업그레이드
* `의존성` Desugar JDK Libs 버전 2.0.3에서 2.0.4로 업그레이드
* `의존성` Test Runner 버전 1.5.2에서 1.6.2로 업그레이드
* `의존성` Junit Jupiter 버전 5.10.0에서 5.10.3으로 업그레이드
* `의존성` OkHttp3 버전 5.0.0-alpha.11에서 4.12.0으로 다운그레이드

# v6.5.0

###### 2023/12/02

* `추가` opencc 모듈 (프로젝트 문서 > [중국어 변환](https://docs.autojs6.com/#/opencc)) (참조 [LZX284](https://github.com/SuperMonster003/AutoJs6/pull/187/files#diff-8cff73265af19c059547b76aca8882cbaa3209291406f52df1dafbbc78e80c46R268))
* `추가` UiSelector에 [plus](https://docs.autojs6.com/#/uiObjectType?id=m-plus) 및 [append](https://docs.autojs6.com/#/uiObjectType?id=m-append) 메소드 추가 _[`issue #115`](http://issues.autojs6.com/115)_
* `추가` 번들 앱 페이지에 ABI 및 라이브러리 필터링 지원 추가 (참조 [AutoX](https://github.com/kkevsekk1/AutoX)) _[`issue #189`](http://issues.autojs6.com/189)_
* `수정` 번들 앱 파일 크기 비정상적으로 큰 문제 (참조 [AutoX](https://github.com/kkevsekk1/AutoX) / [LZX284](https://github.com/SuperMonster003/AutoJs6/pull/187/files#diff-d932ac49867d4610f8eeb21b59306e8e923d016cbca192b254caebd829198856R61)) _[`issue #176`](http://issues.autojs6.com/176)_
* `수정` 번들 앱이 일부 예외 메시지를 표시하지 못하고 인쇄하지 않는 문제
* `수정` 번들 앱 페이지에서 앱 아이콘을 선택한 후 빈 아이콘이 표시될 수 있는 문제
* `수정` 번들 앱이 MLKit Google OCR 라이브러리를 포함할 때 발생할 수 있는 초기화되지 않은 컨텍스트 예외
* `수정` ocr.<u>mlkit/ocr</u>.<u>recognizeText/detect</u> 메소드가 작동하지 않는 문제
* `수정` 일부 텍스트 (로그 페이지 등)의 언어가 앱 설정 언어와 일치하지 않는 문제
* `수정` 홈페이지 드로워 스위치 항목에서 일부 언어가 글자 넘침 현상이 발생할 수 있는 문제
* `수정` 일부 장치에서 접근성 서비스가 켜진 후 즉시 자동으로 꺼지고 아무 메시지도 표시되지 않는 문제 _[`issue #181`](http://issues.autojs6.com/181)_
* `수정` 일부 장치에서 접근성 서비스가 켜진 후 물리 버튼이 앱 충돌을 유발하는 문제 (시도됨) _[`issue #183`](http://issues.autojs6.com/183)_ _[`issue #186`](http://issues.autojs6.com/186#issuecomment-1817307790)_
* `수정` auto(true)로 접근성 서비스를 다시 시작한 후 발생하는 pickup 기능 오류 문제 (시도됨) _[`issue #184`](http://issues.autojs6.com/184)_
* `수정` floaty 모듈에서 떠있는 창을 만들 때 발생할 수 있는 앱 충돌 문제 (시도됨)
* `수정` app.startActivity에서 약칭 매개변수를 사용할 수 없는 문제 _[`issue #182`](http://issues.autojs6.com/182)_ _[`issue #188`](http://issues.autojs6.com/188)_
* `수정` importClass를 사용할 때 클래스 이름이 전역 변수와 충돌하면 코드가 예외를 발생시키는 문제 _[`issue #185`](http://issues.autojs6.com/185)_
* `수정` Android 7.x에서 접근성 서비스를 사용할 수 없는 문제
* `수정` Android 14에서 runtime.<u>loadJar/loadDex</u> 메소드가 정상적으로 작동하지 않는 문제 (시도됨)
* `수정` 안드로이드 시스템의 빠른 설정 패널에서 "레이아웃 범위 분석" 및 "레이아웃 계층 분석"을 사용할 수 없는 문제 _[`issue #193`](http://issues.autojs6.com/193)_
* `수정` 자동 업데이트 검사가 앱 [ANR](https://developer.android.com/topic/performance/vitals/anr)을 유발할 수 있는 문제 (시도됨) _[`issue #186`](http://issues.autojs6.com/186)_
* `수정` 파일 관리자에서 샘플 코드 폴더 클릭 후 '위로' 버튼을 클릭 시 작업 디렉터리 페이지로 돌아가지 않는 문제 _[`issue #129`](http://issues.autojs6.com/129)_
* `수정` 코드 편집기의 바꾸기 기능 사용 시 바꾸기 버튼이 표시되지 않는 문제
* `수정` 코드 편집기에서 길게 눌러 삭제 시 앱 충돌 문제가 발생할 수 있는 문제 (시도됨)
* `수정` 코드 편집기에서 fx 버튼 클릭 시 모듈 함수 빠른 선택 패널이 표시되지 않는 문제
* `수정` 코드 편집기 모듈 함수 빠른 선택 패널에 표시되는 함수 이름이 넘칠 수 있는 문제
* `개선` 코드 편집기 모듈의 빠른 기능 패널이 야간 모드에 적응합니다.
* `개선` 포장된 애플리케이션의 시작 페이지가 야간 모드에 적응하고 애플리케이션 아이콘의 레이아웃이 조정됩니다.
* `개선` 포장된 애플리케이션 페이지는 소프트웨어 키보드의 ENTER 키를 사용하여 커서 내비게이션을 지원합니다.
* `개선` 포장된 애플리케이션 페이지는 ABI 및 라이브러리 제목을 클릭하여 전체 선택 상태를 토글할 수 있습니다.
* `개선` 포장된 애플리케이션 페이지의 기본 ABI 선택은 비선택 항목에 대한 가이드 프롬프트가 추가된 지능형 방식으로 이루어집니다.
* `개선` 파일 관리자에서는 파일 및 폴더의 유형 및 특성에 따라 메뉴 항목의 표시가 조정됩니다.
* `개선` 파일 관리자의 폴더 마우스 오른쪽 클릭 메뉴에 애플리케이션 포장 옵션이 추가됩니다.
* `개선` 접근성 서비스가 활성화되었지만 제대로 작동하지 않는 경우, AutoJs6 홈페이지의 드로어 스위치에 비정상적인 상태가 반영됩니다.
* `개선` 콘솔에는 오류 메시지를 인쇄할 때 상세한 스택 정보가 포함됩니다.
* `의존성` ARSCLib 버전 1.2.4 추가
* `의존성` Flexbox 버전 3.0.0 추가
* `의존성` Android OpenCC 버전 1.2.0 추가
* `의존성` Gradle 버전 8.5-rc-1 -> 8.5 업그레이드

# v6.4.2

###### 2023/11/15

* `추가` dialogs.build() 옵션 매개변수 속성 inputSingleLine
* `추가` console.setTouchable 메서드 _[`issue #122`](http://issues.autojs6.com/122)_
* `수정` ocr 모듈 일부 메서드가 영역 매개변수를 인식하지 못하는 문제 _[`issue #162`](http://issues.autojs6.com/162)_  _[`issue #175`](http://issues.autojs6.com/175)_
* `수정` Android 7.x에서 새로운 버전을 발견했을 때 버전 세부 정보를 가져올 수 없는 문제
* `수정` Android 14에서 스크린샷 권한을 요청할 때 애플리케이션이 충돌하는 문제
* `수정` 홈 화면 드로어에서 '플로팅 버튼' 스위치를 빠르게 전환할 때 애플리케이션이 충돌할 수 있는 문제
* `수정` 메뉴를 사용해 플로팅 버튼을 닫을 때 애플리케이션을 재시작하면 플로팅 버튼이 여전히 표시되는 문제
* `수정` Android 13 이상의 시스템 설정 페이지에서 AutoJs6 언어를 선택하고 전환한 후 적용되지 않는 문제
* `수정` 빌드 도구가 처음 빌드할 때 OpenCV 리소스를 자동으로 배포하지 못하는 문제
* `개선` 네이티브 bridges 모듈로 스크립트 실행 효율성 향상 (Ref to [aiselp](https://github.com/aiselp/AutoX/commit/7c41af6d2b9b36d00440a9c8b7e971d025f98327))
* `개선` 접근성 서비스 관련 코드를 리팩토링하여 접근성 서비스의 기능 안정성 향상 (실험성) _[`issue #167`](http://issues.autojs6.com/167)_
* `개선` UiObject 및 UiObjectCollection의 출력 형식
* `개선` Gradle JDK 버전이 요구 사항을 충족하지 않을 때 빌드 도구에서 업그레이드 알림
* `의존성` Gradle 버전 8.4 -> 8.5-rc-1로 업그레이드
* `의존성` Commons IO 버전 2.14.0 -> 2.8.0으로 다운그레이드
* `의존성` Jackson DataBind 버전 2.14.3 -> 2.13.3으로 다운그레이드

# v6.4.1

###### 2023/11/02

* `수정` 빌드 도구가 알 수 없는 플랫폼에 적응하지 못하는 문제 (by [TonyJiangWJ](https://github.com/TonyJiangWJ)) _[`pr #158`](http://pr.autojs6.com/158)_
* `수정` 스크립트 종료 시 애플리케이션이 충돌할 수 있는 문제 _[`issue #159`](http://issues.autojs6.com/159)_
* `수정` http 모듈에서 응답 객체의 body.contentType 반환 값 유형 오류 _[`issue #142`](http://issues.autojs6.com/142)_
* `수정` device.width 및 device.height 반환 데이터가 정확하지 않은 문제 _[`issue #160`](http://issues.autojs6.com/160)_
* `수정` 코드 편집기에서 길게 눌러 삭제할 때 애플리케이션이 충돌할 수 있는 문제 (테스트 수정) _[`issue #156`](http://issues.autojs6.com/156)_
* `수정` 코드 편집기에서 역방향으로 텍스트를 선택한 후 일반 작업을 수행할 때 애플리케이션이 충돌할 수 있는 문제
* `수정` 일부 장치에서 AutoJs6 애플리케이션 아이콘을 길게 눌렀을 때 바로가기 메뉴가 표시되지 않는 문제
* `수정` 일부 장치에서 프로젝트를 패키징할 때 확인 버튼을 클릭해도 반응이 없는 문제
* `수정` app.sendBroadcast 및 app.startActivity에서 약칭 매개변수를 사용할 수 없는 문제
* `수정` floaty 모듈의 JsWindow#setPosition 등 메서드를 처음 호출할 때의 기능 이상
* `개선` ADB 명령어 실행을 지원하기 위해 Termux 관련 권한 추가 _[`issue #136`](http://issues.autojs6.com/136)_
* `개선` http 모듈에서 가져온 응답 객체를 반복해서 body.string() 및 body.bytes() 메서드로 사용할 수 있음
* `개선` GitHub Actions 자동 패키징 지원 추가 (by [TonyJiangWJ](https://github.com/TonyJiangWJ)) _[`pr #158`](http://pr.autojs6.com/158)_
* `개선` 빌드 도구가 Temurin 플랫폼에 적응
* `의존성` Gradle 버전 8.4-rc-3 -> 8.4로 업그레이드
* `의존성` Android dx 버전 1.11 -> 1.14로 업그레이드

# v6.4.0

###### 2023/10/30

* `추가` ocr 모듈이 Paddle Lite 엔진을 지원 (by [TonyJiangWJ](https://github.com/TonyJiangWJ)) _[`pr #120`](http://pr.autojs6.com/120)_
* `추가` 패키징 기능이 내장 플러그인과 외부 플러그인을 모두 지원 (by [LZX284](https://github.com/LZX284)) _[`pr #151`](http://pr.autojs6.com/151)_
* `추가` WebSocket 모듈 (참고 프로젝트 문서 > [WebSocket](https://docs.autojs6.com/#/webSocketType))
* `추가` barcode / qrcode 모듈 (참고 프로젝트 문서 > [바코드](https://docs.autojs6.com/#/barcode) / [QR 코드](https://docs.autojs6.com/#/qrcode))
* `추가` shizuku 모듈 (참고 프로젝트 문서 > [Shizuku](https://docs.autojs6.com/#/shizuku)) 및 홈 드로어 권한 스위치
* `추가` device.rotation / device.orientation 등 메서드
* `추가` 내부 Java 클래스가 class 정적 속성 액세스를 지원
* `추가` 안드로이드 시스템 설정 페이지에서 애플리케이션 언어 선택 및 전환 지원 ( Android 13 이상)
* `추가` 설정 페이지에서 애플리케이션 아이콘을 길게 눌러 활성화되는 [애플리케이션 바로가기](https://developer.android.com/guide/topics/ui/shortcuts?hl=zh-cn) 지원, 문서 및 설정 페이지로 이동 가능
* `수정` 일부 PR을 다시 병합하여 일부 스크립트가 정상적으로 종료되지 않는 문제 해결 (by [aiselp](https://github.com/aiselp)) _[`pr #75`](http://pr.autojs6.com/75)_ _[`pr #78`](http://pr.autojs6.com/78)_
* `수정` 패키징 애플리케이션에서 AutoJs6의 새로운 API를 사용할 수 없는 문제 (by [LZX284](https://github.com/LZX284)) _[`pr #151`](http://pr.autojs6.com/151)_ _[`issue #149`](http://issues.autojs6.com/149)_
* `수정` 패키징 애플리케이션이 야간 모드에서 스타일 이상 발생
* `수정` VSCode 플러그인이 파일을 로컬에 저장할 때 파일 확장명 정보 손실 문제
* `수정` 코루틴 기능을 사용하여 프로젝트를 실행할 때 애플리케이션이 충돌하는 문제
* `수정` 재시작 또는 애플리케이션 종료 시 플로팅 버튼이 위치 상태 정보를 기록하지 않는 문제
* `수정` 장치 화면 방향이 변경될 때 업데이트된 장치 구성 정보를 가져올 수 없는 문제 _[`issue #153`](http://issues.autojs6.com/153)_
* `수정` 화면이 가로로 회전할 때 툴바 제목 폰트가 너무 작은 문제
* `수정` 화면이 가로로 회전할 때 애플리케이션 홈 탭이 너무 빽빽한 문제
* `수정` 화면이 가로로 회전할 때 플로팅 버튼이 화면에서 넘치는 문제 _[`issue #90`](http://issues.autojs6.com/90)_
* `수정` 화면이 여러 번 회전할 때 플로팅 버튼의 좌표 및 화면 가장자리 방향을 복원할 수 없는 문제
* `수정` 일부 장치에서 메시지 플로팅 프레임이 누락되거나 중복 표시되는 문제
* `수정` 여러 스크립트가 동시에 실행될 때 메시지 플로팅 프레임이 가려질 수 있는 문제 _[`issue #67`](http://issues.autojs6.com/67)_
* `수정` 레이아웃을 브로드캐스트 메시지로 분석할 때 레이아웃을 클릭해도 메뉴가 나타나지 않거나 애플리케이션이 충돌하는 문제
* `수정` 두 번째 및 이후에 생성된 WebSocket 인스턴스가 정상적으로 리스너를 트리거하지 않는 문제
* `수정` importPackage의 전역 리디렉션 메서드를 철회하여 특정 범위에서 패키지 가져오기 예외 방지 _[`issue #88`](http://issues.autojs6.com/88)_
* `수정` 로그 액티비티 페이지에서 복사 또는 내보내기 기능을 사용할 때 애플리케이션이 충돌할 수 있는 문제
* `개선` 로그 액티비티 페이지의 내보내기 기능을 '발송' 기능으로 이름 변경하고 실질적 의미의 내보내기 기능으로 다시 구현
* `개선` 로그 액티비티 페이지에서 발송 기능이 항목 수가 너무 많을 때 자동으로 잘라내고 알림 기능 추가
* `개선` ocr 모듈이 Google MLKit 및 Paddle Lite 엔진을 모두 호환 (참고 프로젝트 문서 > [광학 문자 인식](https://docs.autojs6.com/#/ocr?id=p-mode))
* `개선` 접근성 서비스 자동 시작 성공률 향상
* `개선` Kotlin 어노테이션 처리를 kapt에서 KSP로 전환
* `개선` 빌드 도구가 IntelliJ Idea EAP 버전을 지원
* `개선` Java 배포 버전에 적응하여 '유효하지 않은 배포 버전' 문제 방지
* `개선` 빌드 도구가 IDE 및 관련 플러그인의 버전 다운그레이드 논리를 최적화하고 버전 예측 능력 향상
* `개선` VSCode 플러그인 1.0.7에 적응
* `의존성` Rikka Shizuku 버전 13.1.5 추가
* `의존성` MLKit Barcode Scanning 버전 17.2.0 추가
* `의존성` OpenCV 버전 4.5.5 -> 4.8.0으로 업그레이드 (Ref to [TonyJiangWJ](https://github.com/TonyJiangWJ))
* `의존성` Gradle Compile 버전 33 -> 34로 업그레이드
* `의존성` Gradle 버전 8.3-rc-1 -> 8.4-rc-3로 업그레이드
* `의존성` Apache Commons Lang3 버전 3.12.0 -> 3.13.0으로 업그레이드
* `의존성` Glide 버전 4.15.1 -> 4.16.0으로 업그레이드
* `의존성` Android Analytics 버전 14.3.0 -> 14.4.0으로 업그레이드
* `의존성` Androidx WebKit 버전 1.7.0 -> 1.8.0으로 업그레이드
* `의존성` Androidx Preference 버전 1.2.0 -> 1.2.1으로 업그레이드
* `의존성` Androidx Annotation 버전 1.6.0 -> 1.7.0으로 업그레이드
* `의존성` Androidx Recyclerview 버전 1.3.0 -> 1.3.2로 업그레이드
* `의존성` Android Material 버전 1.9.0 -> 1.10.0으로 업그레이드
* `의존성` Androidx AppCompat 버전 1.4.2 -> 1.6.1으로 업그레이드
* `의존성` Commons IO 버전 2.8.0 -> 2.14.0으로 업그레이드
* `의존성` Jackson DataBind 버전 2.13.3 -> 2.14.3으로 업그레이드
* `의존성` Zeugma Solutions LocaleHelper 버전 1.5.1 제거

# v6.3.3

###### 2023/07/21

* `추가` 코드 편집기의 코드 주석 기능 (by [little-alei](https://github.com/little-alei)) _[`pr #98`](http://pr.autojs6.com/98)_
* `추가` auto.stateListener로 접근성 서비스 연결 상태 감시 (by [little-alei](https://github.com/little-alei)) _[`pr #98`](http://pr.autojs6.com/98)_
* `추가` UiObject 유형에 nextSibling / lastChild / offset 등 메서드 추가 (참고 프로젝트 문서 > [컨트롤 노드](https://docs.autojs6.com/#/uiObjectType))
* `수정` VSCode 플러그인이 스크립트 문자열의 총 길이가 네 자리 십진수 이상일 때 데이터를 분석하지 못하는 문제 _[`issue #91`](http://issues.autojs6.com/91)_ _[`issue #93`](http://issues.autojs6.com/93)_ _[`issue #100`](http://issues.autojs6.com/100)_ _[`issue #109`](http://issues.autojs6.com/109)_
* `수정` VSCode 플러그인이 파일을 정상적으로 저장하지 못하는 문제 _[`issue #92`](http://issues.autojs6.com/91)_ _[`issue #94`](http://issues.autojs6.com/93)_
* `수정` 플로팅 버튼 메뉴 항목 '접근성 서비스 관리' 클릭 후 페이지 이동이 발생하지 않는 문제
* `수정` runtime.requestPermissions 메서드가 누락된 문제 _[`issue #104`](http://issues.autojs6.com/104)_
* `수정` events.emitter가 MainThreadProxy 매개변수를 지원하지 않는 문제 _[`issue #103`](http://issues.autojs6.com/103)_
* `수정` 코드 편집기에서 코드 포맷팅이 되지 않는 문제 _[`pr #78`](http://pr.autojs6.com/78)_
* `수정` JavaAdapter 사용 시 ClassLoader 호출 스택 오버플로우 문제 _[`issue #99`](http://issues.autojs6.com/99)_ _[`issue #110`](http://issues.autojs6.com/110)_
* `개선` 모듈 작용 범위 조정 (by [aiselp](https://github.com/aiselp)) _[`pr #75`](http://pr.autojs6.com/75)_ _[`pr #78`](http://pr.autojs6.com/78)_
* `개선` 출시 버전 애플리케이션 실행 시 서명 검증 제거 (by [LZX284](https://github.com/LZX284)) _[`pr #81`](http://pr.autojs6.com/81)_
* `개선` 코드 편집기의 코드 주석 기능 동작, 스타일 및 커서 위치 처리 _[`pr #98`](http://pr.autojs6.com/98)_ 기반
* `개선` 코드 주석 메뉴 항목 추가 _[`pr #98`](http://pr.autojs6.com/98)_ 기반
* `개선` VSCode 플러그인 1.0.6에 적응
* `개선` UiObject#parent 메서드에 단계 매개변수 지원 추가 (참고 프로젝트 문서 > [컨트롤 노드](https://docs.autojs6.com/#/uiObjectType))
* `의존성` Gradle 버전 8.2 -> 8.3-rc-1로 업그레이드

# v6.3.2

###### 2023/07/06

* `추가` crypto 모듈 (프로젝트 문서 참조 > [암호화](https://docs.autojs6.com/#/crypto)) _[`issue #70`](http://issues.autojs6.com/70)_
* `추가` UI 모드에 textswitcher / viewswitcher / viewflipper / numberpicker / video / search 등의 컨트롤 추가
* `추가` 로그 페이지에 로그 복사 및 내보내기 기능 추가 _[`issue #76`](http://issues.autojs6.com/76)_
* `추가` 클라이언트 모드에 IP 주소 히스토리 기능 추가
* `수정` 클라이언트 모드가 자동 연결되거나 서버 모드가 자동으로 시작된 후 IP 주소 정보를 표시하지 않는 문제
* `수정` 클라이언트 모드 및 서버 모드 연결 후 언어 또는 다크 모드를 변경할 때 연결이 끊기고 다시 연결할 수 없는 문제
* `수정` 클라이언트 모드에서 대상 주소 입력 시 사용자 지정 포트를 사용할 수 없는 문제
* `수정` 클라이언트 모드에서 대상 주소 입력 시 일부 문자가 AutoJs6를 충돌시키는 문제
* `수정` VSCode 플러그인의 원격 명령 해석 실패로 인해 명령이 응답하지 못하는 문제 (실험적 수정)
* `수정` Android 7.x에서 새로운 버전을 발견했을 때 버전 세부 정보를 가져올 수 없는 문제
* `수정` images.pixel이 접근성 서비스의 스크린샷 픽셀 색상을 가져오지 못하는 문제 _[`issue #73`](http://issues.autojs6.com/73)_
* `수정` UI 모드에서 Android 네이티브 컨트롤 (대문자로 시작하는) 이 사전 설정된 컨트롤 속성을 사용할 수 없는 문제
* `수정` runtime.loadDex/loadJar가 여러 파일을 로드할 때 첫 번째 파일만 유효한 문제 _[`issue #88`](http://issues.autojs6.com/88)_
* `수정` 일부 기기에서 애플리케이션 설치 후 런처에 문서 아이콘만 표시되는 문제 (실험적 수정) _[`issue #85`](http://issues.autojs6.com/85)_
* `개선` VSCode 플러그인 1.0.5에 맞춤
* `개선` cheerio 모듈 지원 (Refer to [aiselp](https://github.com/aiselp/AutoX/commit/7176f5ad52d6904383024fb700bf19af75e22903)) _[`issue #65`](http://issues.autojs6.com/65)_
* `개선` JsWebSocket 인스턴스가 rebuild 메서드를 사용하여 인스턴스를 다시 생성하고 연결할 수 있도록 지원 _[`issue #69`](http://issues.autojs6.com/69)_
* `개선` base64 모듈이 number 배열 및 Java 바이트 배열을 주요 인수로 인코딩/디코딩할 수 있도록 지원
* `개선` JavaMail for Android 지원 추가 _[`issue #71`](http://issues.autojs6.com/71)_
* `개선` 버전 업데이트 정보를 가져올 때 Blob 데이터 유형을 사용하여 프록시 없는 네트워크 환경 적응성 향상
* `개선` 클라이언트 모드에서 연결 과정 중 홈 화면 드로어 하위 제목에 대상 IP 주소 표시
* `개선` 클라이언트 모드에서 대상 주소 입력 시 잘못된 입력에 대한 경고 메시지 표시
* `개선` 클라이언트 모드에서 소프트키보드 Enter 키를 사용하여 연결 지원
* `개선` 서버 모드가 시작된 후 항상 활성 상태 유지 (수동으로 종료하거나 애플리케이션 프로세스가 종료될 때까지) _[`issue #64`](http://issues.autojs6.com/64#issuecomment-1596990158)_
* `개선` AutoJs6와 VSCode 플러그인의 양방향 버전 검출 및 비정상 감지 결과 경고 _[`issue #89`](http://issues.autojs6.com/89)_
* `개선` SMS 데이터 읽기 권한 (android.permission.READ_SMS) 추가 (기본 비활성화)
* `개선` findMultiColors 메서드 내부 구현 (by [LYS86](https://github.com/LYS86)) _[`pr #72`](http://pr.autojs6.com/72)_
* `개선` runtime.loadDex/loadJar/load가 디렉토리 단위로 로드하거나 여러 파일을 동시에 로드할 수 있도록 지원
* `의존성` LeakCanary 버전 2.11 -> 2.12 업그레이드
* `의존성` Android Analytics 버전 14.2.0 -> 14.3.0 업그레이드
* `의존성` Gradle 버전 8.2-milestone-1 -> 8.2 업그레이드

# v6.3.1

###### 2023/05/26

* `추가` 알림 권한 및 홈 화면 드로어 스위치 추가 _[`issue #55`](http://issues.autojs6.com/55)_
* `추가` UI 모드가 간단한 Android 레이아웃 해석 지원 (참조 예제 코드 > 레이아웃 > 간단한 Android 레이아웃)
* `추가` UI 모드에 console / imagebutton / ratingbar / switch / textclock / togglebutton 등의 컨트롤 추가
* `추가` UI 모드의 컨트롤 색상 값이 [OmniColor](https://docs.autojs6.com/#/omniTypes?id=omnicolor) 유형 지원 (예: color="orange")
* `추가` UI 모드의 컨트롤이 attr 메서드를 통해 속성 설정 완전히 지원 (예: ui.text.attr('color', 'blue'))
* `추가` UI 모드의 컨트롤이 부울 속성 값을 기본 형식으로 지원 (예: clickable="true" 는 clickable 또는 isClickable로 축약 가능)
* `추가` button 컨트롤이 isColored 및 isBorderless 부울 속성 지원
* `추가` console.resetGlobalLogConfig 메서드가 전역 로그 설정을 재설정
* `추가` web.newWebSocket 메서드가 Web Socket 인스턴스를 생성 (참조 프로젝트 문서 > [웹](https://docs.autojs6.com/#/web?id=m-newwebsocket))
* `수정` 파일 관리자에서 폴더 정렬이 비정상인 문제
* `수정` floaty 모듈로 생성된 플로팅 윈도우가 스타일 및 위치 조정을 할 수 없는 문제 _[`issue #60`](http://issues.autojs6.com/60)_
* `수정` floaty 모듈로 생성된 플로팅 윈도우가 시스템 상태바와 겹치는 문제
* `수정` http.postMultipart 메서드가 제대로 작동하지 않는 문제 _[`issue #56`](http://issues.autojs6.com/56)_
* `수정` Android 7.x에서 스크립트를 실행할 수 없는 문제 _[`issue #61`](http://issues.autojs6.com/61)_
* `수정` sign.property 파일이 없을 때 프로젝트를 빌드할 수 없는 문제
* `수정` 최신 버전의 Android 시스템에서 AutoJs6가 백그라운드로 전환 시 전면 알림 권한이 없어 충돌하는 문제 (API >= 33)
* `수정` console.show 메서드 호출 후 로그 창에서 FAB 버튼 클릭 시 로그를 지울 수 없는 문제
* `수정` 스크립트 편집기 디버깅 중 prototype NullPointerException 발생 문제
* `수정` 스크립트 편집기에서 스크립트가 원본 위치 대신 캐시 폴더에서 실행되어 내용 손실 가능성 방지
* `수정` 레이아웃 계층 분석 도구의 계층 색상 줄이 너무 많을 경우 컨트롤 이름 표시 문제 _[`issue #46`](http://issues.autojs6.com/46)_
* `개선` 레이아웃 분석 플로팅 윈도우에 종료 버튼 추가 _[`issue #63`](http://issues.autojs6.com/63)_
* `개선` 스크립트 절대 경로가 짧은 형식으로 표시되어 텍스트 길이를 줄이고 가독성 향상
* `개선` Error를 Exception으로 교체하여 예외 발생 시 AutoJs6 애플리케이션 충돌 방지
* `개선` View 바인딩 방식을 ButterKnife에서 View Binding으로 전환 _[`issue #48`](http://issues.autojs6.com/48)_
* `개선` 서버 모드가 비정상 종료될 경우 AutoJs6 시작 시 자동으로 시작 _[`issue #64`](http://issues.autojs6.com/64)_
* `개선` 클라이언트 모드가 비정상 종료될 경우 AutoJs6 시작 시 마지막으로 연결된 히스토리 주소로 자동 연결
* `의존성` LeakCanary 버전 2.10 -> 2.11 업그레이드
* `의존성` Android Material 버전 1.8.0 -> 1.9.0 업그레이드
* `의존성` Androidx WebKit 버전 1.6.1 -> 1.7.0 업그레이드
* `의존성` OkHttp3 버전 3.10.0 -> 5.0.0-alpha.9 -> 5.0.0-alpha.11 업그레이드
* `의존성` MLKit Text Recognition Chinese 버전 16.0.0-beta6 -> 16.0.0 업그레이드

# v6.3.0

###### 2023/04/29

* `추가` ocr 모듈 (참조 프로젝트 문서 > [광학 문자 인식](https://docs.autojs6.com/#/ocr)) _[`issue #8`](http://issues.autojs6.com/8)_
* `추가` notice 모듈 (참조 프로젝트 문서 > [메시지 알림](https://docs.autojs6.com/#/notice))
* `추가` s13n 모듈 (참조 프로젝트 문서 > [표준화](https://docs.autojs6.com/#/s13n))
* `추가` Color 모듈 (참조 프로젝트 문서 > [색상 클래스](https://docs.autojs6.com/#/colorType))
* `추가` 화면을 항상 켜두는 기능 및 설정 옵션
* `추가` 독립적으로 애플리케이션 문서를 읽을 수 있는 추가 런처 (설정에서 숨기기 또는 표시 가능)
* `수정` colors.toString 메서드 기능 오류
* `수정` app.openUrl 메서드 자동 프로토콜 접두사 추가 기능 오류
* `수정` app.viewFile/editFile의 인수로 지정된 파일이 존재하지 않을 때 발생하는 비정상 동작
* `수정` pickup 메서드의 콜백 함수가 호출되지 않는 문제
* `수정` 레이아웃 분석에 표시되는 컨트롤 정보에 bounds 속성 값에 마이너스 기호가 쉼표로 대체되는 문제
* `수정` bounds/boundsInside/boundsContains 선택자가 좁은 빈 사각형 (예를 들어, 경계가 뒤집힌 사각형)을 제대로 필터링하지 못하는 문제 _[`issue #49`](http://issues.autojs6.com/49)_
* `수정` 테마를 변경하거나 언어를 변경한 후 홈 화면의 문서 탭을 클릭하거나 길게 클릭하면 애플리케이션이 충돌하는 문제
* `수정` 텍스트 편집기에서 두 손가락으로 글꼴 크기를 조정할 때 발생할 수 있는 흔들림 문제
* `수정` 빌드 스크립트의 일부 종속 요소를 다운로드하지 못하는 문제 (처음부터 통합됨) _[`issue #40`](http://issues.autojs6.com/40)_
* `수정` Tasker에서 AutoJs6 작업 플러그인 (Action Plugin)을 추가할 수 없는 문제 (실험적 수정) _[`issue #41`](http://issues.autojs6.com/41)_
* `수정` 높은 버전의 JDK로 프로젝트를 컴파일할 때 ButterKnife 주석이 리소스 ID를 해석하지 못하는 문제 _[`issue #48`](http://issues.autojs6.com/48)_
* `수정` 접근성 서비스에서 높은 확률로 서비스 예외가 발생하는 문제 (실험적 수정)
* `수정` images.medianBlur의 size 파라미터 사용 방식이 문서와 일치하지 않는 문제
* `수정` engines 모듈이 스크립트의 전체 이름을 표시할 때 파일명과 확장자 사이에 점이 없어지는 문제
* `수정` 가중 RGB 거리 계산 알고리즘의 내부 구현에서 발생할 수 있는 계산 오류 (실험적 수정)
* `수정` console 모듈의 플로팅 윈도우 관련 메서드를 show 메서드 이전에 사용할 수 없는 문제
* `수정` console.setSize 등의 메서드가 적용되지 않는 문제 _[`issue #50`](http://issues.autojs6.com/50)_
* `수정` colors.material 색상 공간의 색상 상수 할당 오류
* `수정` UI 모드의 날짜 선택 컨트롤에서 minDate와 maxDate 속성이 날짜 형식을 제대로 해석하지 못하는 문제
* `수정` 스크립트 실행 후 빠르게 홈의 "작업" 탭 페이지로 전환할 때 동일한 실행 중인 작업이 두 개 나타나는 문제
* `수정` 파일 관리 페이지를 다른 페이지에서 돌아올 때 페이지 상태가 초기화되는 문제 _[`issue #52`](http://issues.autojs6.com/52)_
* `수정` 파일 관리 페이지의 정렬 상태가 아이콘 표시 상태와 일치하지 않는 문제
* `개선` 파일 관리 페이지에 파일 및 폴더의 수정 시간을 표시
* `개선` 파일 관리 페이지에서 정렬 유형 상태를 기억하도록 지원
* `개선` README.md에 프로젝트 컴파일 빌드 섹션 및 스크립트 개발 지원 섹션 추가 _[`issue #33`](http://issues.autojs6.com/33)_
* `개선` images 모듈 관련 메서드의 영역 (region) 옵션 파라미터가 다양한 입력 방식을 지원 (참조 프로젝트 문서 > [올인원 유형](https://docs.autojs6.com/#/omniTypes?id=omniregion))
* `개선` app.startActivity의 페이지 약어 파라미터에 pref/homepage/docs/about 등의 형식 지원 추가
* `개선` web 모듈의 전역 메서드를 모듈 자체에 매핑하여 사용성 향상 (참조 프로젝트 문서 > [월드 와이드 웹](https://docs.autojs6.com/#/web))
* `개선` web.newInjectableWebView 메서드의 내부 기본 구현에 자주 사용하는 WebView 설정 옵션 일부 추가
* `개선` colors 모듈에 다양한 변환 메서드 및 유틸리티 메서드를 추가하고, 더 많은 정적 상수 및 인수로 사용할 수 있는 색상 이름 추가
* `개선` console 모듈에 여러 가지 콘솔 플로팅 윈도우 스타일 설정 방법 추가 및 build 생성기를 사용하여 창 스타일 통일 구성 지원
* `개선` 콘솔 플로팅 윈도우에서 제목 영역을 드래그하여 윈도우 위치 이동 지원
* `개선` 콘솔 플로팅 윈도우가 스크립트 종료 후 자동 지연 종료 지원
* `개선` 콘솔 플로팅 윈도우 및 해당 Activity 윈도우가 두 손가락으로 글꼴 크기 조정 지원
* `개선` http 모듈 관련 메서드가 타임아웃 파라미터 (timeout) 지원
* `개선` Gradle 빌드 스크립트가 JDK 버전 강제 다운그레이드를 지원 (fallback)
* `개선` Gradle 빌드 스크립트가 플랫폼 유형 및 버전에 따라 자동으로 적합한 빌드 도구 버전을 선택 (한정된 범위 내에서)
* `의존성` 로컬화된 Auto.js APK Builder 버전 1.0.3
* `의존성` 로컬화된 MultiLevelListView 버전 1.1
* `의존성` 로컬화된 Settings Compat 버전 1.1.5
* `의존성` 로컬화된 Enhanced Floaty 버전 0.31
* `의존성` MLKit Text Recognition Chinese 버전 16.0.0-beta6 부가 추가
* `의존성` Gradle 버전 8.0-rc-1 -> 8.2-milestone-1 업그레이드
* `의존성` Android Material 버전 1.7.0 -> 1.8.0 업그레이드
* `의존성` Glide 버전 4.14.2 -> 4.15.1 업그레이드
* `의존성` Joda Time 버전 2.12.2 -> 2.12.5 업그레이드
* `의존성` Android Analytics 버전 14.0.0 -> 14.2.0 업그레이드
* `의존성` Androidx WebKit 버전 1.5.0 -> 1.6.1 업그레이드
* `의존성` Androidx Recyclerview 버전 1.2.1 -> 1.3.0 업그레이드
* `의존성` Zip4j 버전 2.11.2 -> 2.11.5 업그레이드
* `의존성` Junit Jupiter 버전 5.9.2 -> 5.9.3 업그레이드
* `의존성` Androidx Annotation 버전 1.5.0 -> 1.6.0 업그레이드
* `의존성` Jackson DataBind 버전 2.14.1 -> 2.14.2 업그레이드
* `의존성` Desugar JDK Libs 버전 2.0.0 -> 2.0.3 업그레이드

# v6.2.0

###### 2023/01/21

* `추가` 프로젝트 문서의 재설계 및 작성 (일부 완료)
* `추가` 서/프/러/아/일/한/영/번체 등 여러 언어 적응
* `추가` 작업 경로 설정 옵션에 경로 선택/기록/기본값 스마트 제안 기능 추가
* `추가` 파일 관리자가 임의 디렉토리의 상위 디렉토리로 이동 지원 ("내부 저장소" 디렉토리까지)
* `추가` 파일 관리자가 임의 디렉토리를 작업 경로로 빠르게 설정 지원
* `추가` 버전 업데이트 무시 및 무시한 업데이트 관리 기능
* `추가` 텍스트 편집기가 두 손가락으로 글꼴 크기를 조절 지원
* `추가` idHex 선택자 (UiSelector#idHex) (프로젝트 문서 참조 > [선택자](https://docs.autojs6.com/#/uiSelectorType))
* `추가` action 선택자 (UiSelector#action) (프로젝트 문서 참조 > [선택자](https://docs.autojs6.com/#/uiSelectorType))
* `추가` Match 시리즈 선택자 (UiSelector#xxxMatch) (프로젝트 문서 참조 > [선택자](https://docs.autojs6.com/#/uiSelectorType))
* `추가` 픽업 선택자 (UiSelector#pickup) (프로젝트 문서 참조 > [선택자](https://docs.autojs6.com/#/uiSelectorType)) _[`issue #22`](http://issues.autojs6.com/22)_
* `추가` 컨트롤 탐지 (UiObject#detect) (프로젝트 문서 참조 > [컨트롤 노드](https://docs.autojs6.com/#/uiObjectType))
* `추가` 컨트롤 나침반 (UiObject#compass) (프로젝트 문서 참조 > [컨트롤 노드](https://docs.autojs6.com/#/uiObjectType)) _[`issue #23`](http://issues.autojs6.com/23)_
* `추가` 글로벌 대기 메서드 wait (프로젝트 문서 참조 > [전역 객체](https://docs.autojs6.com/#/global?id=m-wait))
* `추가` 글로벌 스케일 메서드 cX/cY/cYx (프로젝트 문서 참조 > [전역 객체](https://docs.autojs6.com/#/global?id=m-wait))
* `추가` 글로벌 앱 유형 (프로젝트 문서 참조 > [응용 프로그램 열거형 클래스](https://docs.autojs6.com/#/appType))
* `추가` i18n 모듈 (banana-i18n 기반의 JavaScript 다국어 솔루션) (프로젝트 문서 참조 > 국제화)
* `수정` 소프트웨어 언어를 전환 후 발생할 수 있는 페이지 텍스트 깜박임 및 일부 페이지 버튼 기능 이상
* `수정` 작업 경로가 프로젝트일 때 소프트웨어 시작 후 프로젝트 도구 모음이 표시되지 않는 문제
* `수정` 작업 경로가 소프트웨어 언어 전환에 따라 자동 변경될 수 있는 문제 _[`issue #19`](http://issues.autojs6.com/19)_
* `수정` 예약 작업 시작 지연 현저 (테스트 수정) _[`issue #21`](http://issues.autojs6.com/21)_
* `수정` JavaScript 모듈명이 덮어쓰여지면서 존재하는 의존성을 가진 내부 모듈이 제대로 작동하지 않는 문제 _[`issue #29`](http://issues.autojs6.com/29)_
* `수정` 고버전 안드로이드 시스템에서 빠른 설정 패널의 관련 아이콘을 클릭한 후 패널이 자동으로 숨겨지지 않는 문제 (테스트 수정) _[`issue #7`](http://issues.autojs6.com/7)_
* `수정` 고버전 안드로이드 시스템에서 일부 페이지와 알림창 영역이 겹치지 않는 문제
* `수정` 안드로이드 10 이상 시스템에서 붓 색상을 설정하는 예제 코드가 정상적으로 작동하지 않는 문제
* `수정` 예제 코드인 "음악 관리"의 파일명을 "파일 관리"로 수정하고 정상 기능 복구
* `수정` 파일 관리자가 새로 고침 시 위치 이동 문제가 발생할 수 있는 문제
* `수정` ui 모듈 스코프 바인딩 오류로 인해 일부 UI 기반 스크립트가 컴포넌트 속성에 접근하지 못하는 문제
* `수정` 스크립트 녹화 후 입력 파일명 대화 상자가 외부 영역 클릭으로 인해 녹화 내용을 분실할 수 있는 문제
* `수정` 문서의 일부 챕터 제목이 화면 너비를 초과할 때 자동 줄 바꿈이 되지 않아 내용이 분실되는 문제
* `수정` 문서의 예제 코드 영역이 정상적으로 좌우로 슬라이드되지 않는 문제
* `수정` 문서 페이지를 새로 고침 시 예외적인 행동 및 새로 고침 취소 조작이 불가능한 문제 (테스트 수정)
* `수정` 애플리케이션 초기 설치 후 홈 화면의 드로어 나이트 모드 전환 관련 문제 해결
* `수정` 시스템 나이트 모드가 활성화될 때 애플리케이션 시작 후 강제 나이트 모드 적용 문제
* `수정` 나이트 모드 활성화 후 설정된 테마 색상이 적용되지 않는 문제
* `수정` 나이트 모드에서 일부 설정 옵션 텍스트와 배경색이 동일하여 읽기가 어려운 문제
* `수정` 정보 페이지의 기능 버튼 텍스트 길이가 너무 길어 텍스트가 완전히 표시되지 않는 문제
* `수정` 홈 화면 드로어 설정 항목 텍스트 길이가 길어 텍스트와 버튼이 겹치는 문제
* `수정` 홈 화면 드로어 권한 전환이 팝업 대화창 사라지 후 동기화되지 않는 문제가 발생할 수 있음
* `수정` Root 권한이 홈 화면 드로어 권한 전환 실패 시 ADB 도구 대화창이 계속 나타나지 않는 문제
* `수정` Root 권한이 처음 사용할 때 포인터 위치 표시가 권한이 없다고 나타나는 문제
* `수정` 아이콘 선택 페이지의 아이콘 요소가 제대로 배치되지 않는 문제
* `수정` 텍스트 편집기가 시작 중 나이트 모드 설정에 따라 깜박임이 발생할 수 있는 문제 (테스트 수정)
* `수정` 텍스트 편집기 글꼴 크기 설정 시 최대값이 제한되는 문제
* `수정` 일부 안드로이드 시스템에서 스크립트 실행 후 로그에서 실행 지속 시간 통계가 표시되지 않는 문제
* `수정` 플로팅 버튼 메뉴를 닫은 후 애플리케이션을 재시작할 때 플로팅 버튼이 여전히 표시되는 문제
* `수정` 레이아웃 계층 분석 중 리스트 항목을 길게 눌렀을 때 팝업 메뉴가 아래 화면에 넘치는 문제
* `수정` 안드로이드 7.x 시스템에서 나이트 모드 비활성화 시 내비게이션 버튼이 알아보기가 어려운 문제
* `수정` http.post 등의 메서드 요청이 닫히지 않는 예외
* `수정` colors.toString 메서드에서 Alpha 채널이 0일 때 해당 채널 정보가 결과에서 손실되는 문제
* `개선` 자동 하위 호환성을 가능하게 하기 위해 Auto.js 4.x 버전의 공용 클래스 방향 재설정 (제한된 범위 내)
* `개선` 모든 프로젝트 모듈 병합하여 순환 참조 등 문제 회피 (임시 inrt 모듈 제거)
* `개선` Gradle 빌드 설정을 Groovy에서 KTS로 마이그레이션
* `개선` Rhino 예외 메시지에 다국어 지원 추가
* `개선` 홈 화면 드로어 권한 전환 오류 메시지 팝업
* `개선` 홈 화면 드로어 레이아웃이 상태바 하단에 맞춰 조정하여 상단 색상 막대와의 낮은 호환성 해결
* `개선` 업데이트/업데이트 다운로드/업데이트 알림 기능이 Android 7.x 시스템과 호환
* `개선` 설정 페이지의 재설계 (AndroidX로 마이그레이션)
* `개선` 설정 페이지에서 설정 옵션을 길게 눌러 자세한 정보 확인 지원
* `개선` 나이트 모드: "시스템 따라가기" 옵션 추가 (Android 9 이상)
* `개선` 애플리케이션 시작 화면 나이트 모드에 맞게 조정
* `개선` 앱 아이콘에 숫자 식별자를 추가하여 다중 오픈소스 버전 공존 사용자 경험 개선
* `개선` 테마 색상에 더 많은 Material Design Color (재료 설계 색상) 옵션 추가
* `개선` 파일 관리자/작업 패널 등 리스트 항목 아이콘의 적정 경량화 및 테마 색 지원
* `개선` 홈화면 검색 창의 텍스트 힌트 텍스트의 나이트 모드 지원
* `개선` 다이얼로그/텍스트/Fab/AppBar/리스트 항목 등의 나이트 모드 지원
* `개선` 문서/설정/정보/테마 색상/레이아웃 분석 등의 페이지 및 플로팅 버튼 메뉴의 나이트 모드 지원
* `개선` 페이지 레이아웃이 RTL (오른쪽에서 왼쪽) 레이아웃과 최대한 호환되도록 조정
* `개선` 정보 페이지에 아이콘 애니메이션 효과 추가
* `개선` 정보 페이지 저작권 선언 텍스트의 자동 연도 업데이트
* `개선` 초기 설치 후 적합한 작업 디렉토리를 자동으로 결정하고 설정
* `개선` 문서 페이지의 두 손가락 확대 기능 사용 제한하여 문서 내용 표시 오류 방지
* `개선` 작업 패널 리스트 항목이 상대 경로로 작업 이름 및 경로 표시를 간략화
* `개선` 텍스트 편집기 버튼 텍스트 적절하게 줄여 텍스트가 넘치지 않도록 지원
* `개선` 텍스트 편집기 글꼴 크기 설정에 기본값 복구 지원
* `개선` 플로팅 버튼 클릭 응답 속도 개선
* `개선` 플로팅 버튼 레이아웃 분석 버튼 클릭 시 직접 범위 분석 수행
* `개선` 레이아웃 분석 테마 자동 적용 (플로팅 창은 앱 테마를 따르고, 빠른 설정 패널은 시스템 테마를 따름)
* `개선` 레이아웃 컨트롤 정보 리스트를 사용 빈도에 따라 재배열
* `개선` 레이아웃 컨트롤 정보 클릭 시 선택자 유형에 따라 자동으로 출력 형식 최적화
* `개선` 플로팅 창을 통해 파일 선택 시 뒤로 가기 키를 누르면 상위 디렉토리로 이동 지원 (창 닫지 않고)
* `개선` 클라이언트 모드에서 컴퓨터 주소 입력 시 숫자 유효성 검사 및 점 구분 기호 자동 변환 지원
* `개선` 클라이언트 및 서버가 연결되면 홈 화면 드로어에 해당 기기의 IP 주소 표시
* `개선` 일부 전역 객체 및 내장 모듈에 덮어쓰기 방지 추가 (프로젝트 문서 참조 > 전역 객체 > [덮어쓰기 방지](https://docs.autojs6.com/#/global?id=%e8%a6%86%e5%86%99%e4%bf%9d%e6%8a%a4))
* `개선` importClass 및 importPackage 문자열 매개변수 지원 및 가변 매개변수 지원
* `개선` ui.run 오류 시 예외 스택 추적 정보 출력 지원
* `개선` ui.R 및 auto.R로 AutoJs6의 리소스 ID를 쉽게 얻을 수 있음
* `개선` app 모듈의 응용 관련 메서드가 App 유형 매개변수 및 응용 별명 매개변수 지원
* `개선` dialogs 모듈의 비동기 콜백 관련 메서드가 사전 채워진 매개변수 생략 지원
* `개선` app.startActivity 등이 url 옵션 매개변수 지원 (예제 코드 참조 > 응용 프로그램 > 인텐트)
* `개선` device 모듈이 IMEI 또는 하드웨어 시리얼 번호를 얻지 못했을 때 null을 반환 (예외 발생 X)
* `개선` console.show 로그 플로팅 창 텍스트 밝기 개선하여 내용 식별성 향상
* `개선` ImageWrapper#saveTo 상대 경로로 이미지 파일 저장 지원
* `개선` colors 전역 객체 재설계 및 HSV / HSL 등 색상 모드 지원 추가 (프로젝트 문서 참조 > [컬러](https://docs.autojs6.com/#/color))
* `의존성` Gradle Compile 버전 32 -> 33 업그레이드
* `의존성` 로컬화된 Android Job 버전 1.4.3
* `의존성` 로컬화된 Android Plugin Client SDK For Locale 버전 9.0.0
* `의존성` 로컬화된 GitHub API 버전 1.306
* `의존성` JCIP Annotations 부가 추가 버전 1.0
* `의존성` Androidx WebKit 부가 추가 버전 1.5.0
* `의존성` Commons IO 부가 추가 버전 2.8.0
* `의존성` Desugar JDK Libs 부가 추가 버전 2.0.0
* `의존성` Jackson DataBind 부가 추가 버전 2.13.3
* `의존성` Jaredrummler Android Device Names 부가 추가 버전 2.1.0
* `의존성` Jaredrummler Animated SVG View 부가 추가 버전 1.0.6
* `의존성` Jrummyapps ColorPicker 버전 2.1.7을 Jaredrummler ColorPicker 버전 1.1.0으로 교체
* `의존성` Gradle 버전 7.5-rc-1 -> 8.0-rc-1 업그레이드
* `의존성` Gradle 빌드 도구 버전 7.4.0-alpha02 -> 8.0.0-alpha09 업그레이드
* `의존성` Kotlin Gradle 플러그인 버전 1.6.10 -> 1.8.0-RC2 업그레이드
* `의존성` Android Material 버전 1.6.0 -> 1.7.0 업그레이드
* `의존성` Androidx Annotation 버전 1.3.0 -> 1.5.0 업그레이드
* `의존성` Androidx AppCompat 버전 1.4.1 -> 1.4.2 업그레이드
* `의존성` Android Analytics 버전 13.3.0 -> 14.0.0 업그레이드
* `의존성` Gson 버전 2.9.0 -> 2.10 업그레이드
* `의존성` Joda Time 버전 2.10.14 -> 2.12.1 업그레이드
* `의존성` Kotlinx Coroutines 버전 1.6.1-native-mt -> 1.6.1 업그레이드
* `의존성` OkHttp3 버전 3.10.0 -> 5.0.0-alpha.7 -> 5.0.0-alpha.9 업그레이드
* `의존성` Zip4j 버전 2.10.0 -> 2.11.2 업그레이드
* `의존성` Glide 버전 4.13.2 -> 4.14.2 업그레이드
* `의존성` Junit Jupiter 버전 5.9.0 -> 5.9.1 업그레이드

# v6.1.1

###### 2022/05/31

* `추가` 업데이트 확인/업데이트 다운로드/업데이트 알림 기능 (설정 페이지 참조) (현재 Android 7.x 시스템 미지원)
* `수정` 애플리케이션이 Android 10 시스템에서 외부 저장소를 읽고 쓸 수 없는 문제 _[`issue #17`](http://issues.autojs6.com/17)_
* `수정` 편집기 페이지 길게 누르기 시 애플리케이션이 충돌할 수 있는 문제 _[`issue #18`](http://issues.autojs6.com/18)_
* `수정` 편집기 페이지 길게 누르기 메뉴에서 "행 삭제" 및 "행 복사" 기능이 무효한 문제
* `수정` 편집기 페이지 옵션 메뉴에서 "붙여넣기" 기능이 누락된 문제
* `개선` 일부 예외 메시지 문자열의 리소스화 (en / zh)
* `개선` 저장되지 않은 내용 대화 상자의 버튼 배치 조정 및 색상 차별화 추가
* `의존성` github-api 버전 1.306 추가
* `의존성` retrofit2-rxjava2-adapter 버전 1.0.0을 adapter-rxjava2 버전 2.9.0으로 교체

# v6.1.0

###### 2022/05/26 - 패키지명 변경, 주의하여 업그레이드

* `힌트` 앱 패키지명을 org.autojs.autojs6으로 변경하여 오픈소스 Auto.js 앱 패키지명과의 충돌을 피합니다.
* `추가` 홈 드로어에 "투영 미디어 권한" 스위치 추가 (Root / ADB 방식) (스위치 상태 감지는 실험적입니다)
* `추가` 파일 브라우저에서 숨김 파일 및 폴더 표시 지원 (설정 페이지 참조)
* `추가` 강제 Root 검사 기능 (설정 페이지 및 샘플 코드 참조)
* `추가` autojs 모듈 (샘플 코드 > AutoJs6 참조)
* `추가` tasks 모듈 (샘플 코드 > 작업 참조)
* `추가` console.launch() 메서드 로그 활동 페이지 시작
* `추가` util.morseCode 도구 (샘플 코드 > 도구 > 모스 부호 참조)
* `추가` util.versionCodes 도구 (샘플 코드 > 도구 > 안드로이드 버전 정보 검색 참조)
* `추가` util.getClass() 등 메서드 (샘플 코드 > 도구 > 클래스 및 클래스명 가져오기 참조)
* `추가` timers.setIntervalExt() 메서드 (샘플 코드 > 타이머 > 조건부 주기 실행 참조)
* `추가` colors.toInt() / rgba() 등 메서드 (샘플 코드 > 이미지 및 색상 > 기본 색상 변환 참조)
* `추가` automator.isServiceRunning() / ensureService() 메서드
* `추가` automator.lockScreen() 등 메서드 (샘플 코드 > 접근성 서비스 > Android 9 추가 참조)
* `추가` automator.headsethook() 등 메서드 (샘플 코드 > 접근성 서비스 > Android 11 추가 참조)
* `추가` automator.captureScreen() 메서드 (샘플 코드 > 접근성 서비스 > 스크린샷 가져오기 참조)
* `추가` dialogs.build() 옵션 매개변수 속성 animation, linkify 등 (샘플 코드 > 대화상자 > 맞춤형 대화상자 참조)
* `수정` dialogs.build() 옵션 매개변수 속성 inputHint, itemsSelectedIndex 등 기능 오류
* `수정` JsDialog#on('multi_choice') 콜백 매개변수 기능 오류
* `수정` UiObject#parent().indexInParent() 항상 -1을 반환하는 문제 _[`issue #16`](http://issues.autojs6.com/16)_
* `수정` Promise.resolve()가 반환하는 Thenable이 스크립트 종료 시 호출되지 않을 수 있는 문제
* `수정` 패키지명 또는 클래스명에서 가능성 있는 오타 (boardcast -> broadcast / auojs -> autojs)
* `수정` images.requestScreenCapture()에서 높은 버전의 안드로이드 시스템에서 앱이 충돌할 수 있는 문제 (API >= 31)
* `수정` images.requestScreenCapture() 여러 스크립트 인스턴스가 동시에 요청할 때 앱이 충돌할 수 있는 문제
* `수정` new RootAutomator() 호출 시 발생할 수 있는 멈춤 문제
* `개선` RootAutomator는 Root 권한이 없을 때 인스턴스화되지 않습니다.
* `개선` "앱 및 개발자 정보" 페이지 재설계
* `개선` 모든 내장 JavaScript 모듈 재구성
* `개선` 모든 Gradle 빌드 스크립트 재구성 및 공통 구성 스크립트 추가 (config.gradle)
* `개선` Gradle 빌드 도구 버전 관리 및 빌드 파일 자동 명명 지원
* `개선` Gradle 빌드 도구에 task를 추가하여 빌드 파일에 CRC32 요약 부착 지원 (appendDigestToReleasedFiles)
* `개선` shell() 호출 시 예외를 반환 결과에 씁니다. (try/catch 불필요)
* `개선` Rhino 내장 JSON을 사용하여 원래 json2 모듈 대체
* `개선` auto.waitFor() 타임아웃 매개변수 지원
* `개선` threads.start() 화살표 함수 매개변수 지원
* `개선` console.trace() 로그 레벨 매개변수 지원 (샘플 코드 > 콘솔 > 호출 스택 출력 참조)
* `개선` device.vibrate() 모드 진동 및 모스 부호 진동 지원 (샘플 코드 > 장치 > 모드 진동 / 모스 부호 진동 참조)
* `개선` 외부 저장소 읽기/쓰기 권한을 높은 버전의 안드로이드 시스템에 적응 (API >= 30)
* `개선` 콘솔 글꼴은 Material Color를 사용하여 일반 및 야간 테마에서 글꼴 가독성 향상
* `개선` 모든 ImageWrapper 인스턴스를 약한 참조로 저장하고 스크립트 종료 시 자동으로 회수 (실험적)
* `의존성` CircleImageView 버전 3.1.0 추가
* `의존성` Android Analytics 버전 13.1.0 -> 13.3.0 업그레이드
* `의존성` Gradle 빌드 도구 버전 7.3.0-alpha06 -> 7.4.0-alpha02 업그레이드
* `의존성` Android Job 버전 1.4.2 -> 1.4.3 업그레이드
* `의존성` Android Material 버전 1.5.0 -> 1.6.0 업그레이드
* `의존성` CrashReport 버전 2.6.6 -> 4.0.4 업그레이드
* `의존성` Glide 버전 4.13.1 -> 4.13.2 업그레이드
* `의존성` Joda Time 버전 2.10.13 -> 2.10.14 업그레이드
* `의존성` Kotlin Gradle 플러그인 버전 1.6.10 -> 1.6.21 업그레이드
* `의존성` Kotlinx Coroutines 버전 1.6.0 -> 1.6.1-native-mt 업그레이드
* `의존성` LeakCanary 버전 2.8.1 -> 2.9.1 업그레이드
* `의존성` OkHttp3 버전 5.0.0-alpha.6 -> 5.0.0-alpha.7 업그레이드
* `의존성` Rhino 엔진 버전 1.7.14 -> 1.7.15-snapshot 업그레이드
* `의존성` Zip4j 버전 2.9.1 -> 2.10.0 업그레이드
* `의존성` Groovy JSON 버전 3.0.8 제거
* `의존성` Kotlin Stdlib JDK7 버전 1.6.21 제거

# v6.0.3

###### 2022/03/19

* `추가` 다국어 전환 기능 (아직 완벽하지 않음)
* `추가` recorder 모듈 (샘플 코드 > 타이머 참조)
* `추가` "보안 설정 수정 권한"을 사용하여 자동으로 접근성 서비스 및 스위치 설정
* `수정` 빠른 설정 패널에서 관련 아이콘을 클릭하고 나서 패널이 자동으로 닫히지 않는 문제 (임시 수정) _[`issue #7`](http://issues.autojs6.com/7)_
* `수정` toast 강제 표시 매개변수 사용 시 AutoJs6가 충돌할 수 있는 문제
* `수정` Socket 데이터 전송 시 헤더 정보가 불완전할 때 AutoJs6가 충돌할 수 있는 문제
* `개선` AutoJs6 시작 또는 재시작 시 옵션 설정에 따라 자동으로 접근성 서비스 활성화
* `개선` 플로팅 버튼 스위치를 활성화하면 접근성 서비스 자동 활성화 시도
* `개선` 모든 리소스 파일에 해당하는 영문 번역 추가
* `개선` 홈 드로어 레이아웃 약간 조정, 항목 간격 축소
* `개선` 홈 드로어에 전경 서비스 상태 스위치 동기화 추가
* `개선` 홈 드로어 확장 시 필요에 따라 스위치 상태를 즉시 동기화
* `개선` 포인터 위치 표시 상태 감지 및 결과 표시 추가
* `개선` 64비트 운영 체제 지원 (Ref to [TonyJiangWJ](https://github.com/TonyJiangWJ))
* `개선` 플로팅 버튼 초기화 시 투명도 설정을 즉시 적용 (클릭 후에 적용 필요 없음)
* `개선` 파일 내용 재설정 시 샘플 코드 파일인지 여부 감지 및 결과 알림 추가
* `개선` 번들 플러그인 다운로드 주소 GitHub -> JsDelivr로 이전
* `의존성` Zeugma Solutions LocaleHelper 버전 1.5.1 추가
* `의존성` Android Material 버전 1.6.0-alpha02 -> 1.5.0 다운그레이드
* `의존성` Kotlinx Coroutines 버전 1.6.0-native-mt -> 1.6.0 업그레이드
* `의존성` OpenCV 버전 3.4.3 -> 4.5.4 -> 4.5.5 (Ref to [TonyJiangWJ](https://github.com/TonyJiangWJ)) 업그레이드
* `의존성` OkHttp3 버전 3.10.0 -> 5.0.0-alpha.4 -> 5.0.0-alpha.6 업그레이드
* `의존성` Gradle 빌드 도구 버전 7.2.0-beta01 -> 7.3.0-alpha06 업그레이드
* `의존성` Auto.js-ApkBuilder 버전 1.0.1 -> 1.0.3 업그레이드
* `의존성` Glide Compiler 버전 4.12.0 -> 4.13.1 업그레이드
* `의존성` Gradle 릴리스 버전 7.4-rc-2 -> 7.4.1 업그레이드
* `의존성` Gradle Compile 버전 31 -> 32 업그레이드
* `의존성` Gson 버전 2.8.9 -> 2.9.0 업그레이드

# v6.0.2

###### 2022/02/05

* `추가` images.bilateralFilter() 양방향 필터링 이미지 처리 방법
* `수정` 여러 번 toast 호출 시 마지막 호출만 적용되는 문제
* `수정` toast.dismiss()가 무효화될 수 있는 문제
* `수정` 클라이언트 모드 및 서버 모드 스위치가 정상적으로 작동하지 않을 수 있는 문제
* `수정` 클라이언트 모드 및 서버 모드 스위치 상태가 정상적으로 새로 고침되지 않는 문제
* `수정` Android 7.x에서 UI 모드 텍스트 요소 분석 오류 (Ref to [TonyJiangWJ](https://github.com/TonyJiangWJ)) _[`issue #4`](http://issues.autojs6.com/4)_ _[`issue #9`](http://issues.autojs6.com/9)_
* `개선` sleep()의 ScriptInterruptedException 예외를 무시
* `의존성` Androidx AppCompat (Legacy) 버전 1.0.2 추가
* `의존성` Androidx AppCompat 버전 1.4.0 -> 1.4.1 업그레이드
* `의존성` Androidx Preference 버전 1.1.1 -> 1.2.0 업그레이드
* `의존성` Rhino 엔진 버전 1.7.14-snapshot -> 1.7.14 업그레이드
* `의존성` OkHttp3 버전 3.10.0 -> 5.0.0-alpha.3 -> 5.0.0-alpha.4 업그레이드
* `의존성` Android Material 버전 1.6.0-alpha01 -> 1.6.0-alpha02 업그레이드
* `의존성` Gradle 빌드 도구 버전 7.2.0-alpha06 -> 7.2.0-beta01 업그레이드
* `의존성` Gradle 릴리스 버전 7.3.3 -> 7.4-rc-2 업그레이드

# v6.0.1

###### 2022/01/01

* `추가` VSCode 플러그인 지원 클라이언트(LAN) 및 서버(LAN/ADB) 방식 연결 지원 (참조 [Auto.js Pro](https://g.pro.autojs.org/))
* `추가` base64 모듈 (참조 [Auto.js Pro](https://g.pro.autojs.org/))
* `추가` isInteger/isNullish/isObject/isPrimitive/isReference 글로벌 메소드 추가
* `추가` polyfill (Object.getOwnPropertyDescriptors) 추가
* `추가` polyfill (Array.prototype.flat) 추가
* `개선` global.sleep 확장 지원 랜덤 범위/음수 호환
* `개선` global.toast 확장 지원 시간 제어/강제 덮어쓰기 제어/해제
* `개선` 패키지명 객체 전역화 (okhttp3/androidx/de)
* `의존성` Android Material 버전 업그레이드 1.5.0-beta01 -> 1.6.0-alpha01
* `의존성` Gradle 빌드 도구 버전 업그레이드 7.2.0-alpha04 -> 7.2.0-alpha06
* `의존성` Kotlinx Coroutines 버전 업그레이드 1.5.2-native-mt -> 1.6.0-native-mt
* `의존성` Kotlin Gradle 플러그인 버전 업그레이드 1.6.0 -> 1.6.10
* `의존성` Gradle 릴리즈 버전 업그레이드 7.3 -> 7.3.3

# v6.0.0

###### 2021/12/01

* `추가` 홈 드로어 하단에 앱 재시작 버튼 추가
* `추가` 홈 드로어에 배터리 최적화 무시/다른 앱 위에 표시 스위치 추가
* `수정` 앱 초기 설치 후 일부 영역의 테마 색상 렌더링 이상 문제
* `수정` sign.property 파일이 없을 때 프로젝트를 빌드할 수 없는 문제
* `수정` 일회성 작업의 달 저장 및 불러오기 오류
* `수정` 앱 설정 페이지의 토글 색상이 테마 변경에 따르지 않는 문제
* `수정` 패키지 플러그인 및 패키지 플러그인 다운로드 주소 인식 불가 문제
* `수정` 홈 드로어 "사용 상황 권한 확인" 스위치 상태가 동기화되지 않을 수 있는 문제
* `수정` TemplateMatching.fastTemplateMatching의 잠재적인 Mat 메모리 누수 문제
* `개선` Rhino 엔진 버전 업그레이드 1.7.7.2 -> 1.7.13 -> 1.7.14-snapshot
* `개선` OpenCV 버전 업그레이드 3.4.3 -> 4.5.4
* `개선` ViewUtil.getStatusBarHeight 호환성 향상
* `개선` 홈 드로어 사용자 로그인 관련 모듈 제거 및 레이아웃 자리 비우기
* `개선` 홈에서 커뮤니티 및 마켓 탭을 제거하고 레이아웃 정렬 개선
* `개선` 일부 설정 옵션의 기본 토글 상태 변경
* `개선` 정보 페이지에 SinceDate 추가 및 저작권 표기 개선
* `개선` JSON 모듈을 2017-06-12 버전으로 업그레이드하고 cycle.js 통합
* `개선` 앱 포그라운드시 자동 업데이트 확인 기능 제거 및 업데이트 확인 관련 버튼 삭제
* `개선` AppOpsKt#isOpPermissionGranted 내부 코드 로직 개선
* `개선` ResourceMonitor에서 ReentrantLock 사용 안전성 개선 (참조 [TonyJiangWJ](https://github.com/TonyJiangWJ))
* `개선` Maven Central 등의 저장소를 사용하여 JCenter 저장소 대체
* `개선` 중복된 로컬 라이브러리 파일을 분리 및 제거
* `의존성` CrashReport 버전 로컬라이제이션 2.6.6
* `의존성` MutableTheme 버전 로컬라이제이션 1.0.0
* `의존성` Androidx Preference 버전 추가 1.1.1
* `의존성` SwipeRefreshLayout 버전 추가 1.1.0
* `의존성` Android Analytics 버전 업그레이드 7.0.0 -> 13.1.0
* `의존성` Android Annotations 버전 업그레이드 4.5.2 -> 4.8.0
* `의존성` Gradle 빌드 도구 버전 업그레이드 3.2.1 -> 4.1.0 -> 7.0.3 -> 7.2.0-alpha04
* `의존성` Android Job 버전 업그레이드 1.2.6 -> 1.4.2
* `의존성` Android Material 버전 업그레이드 1.1.0-alpha01 -> 1.5.0-beta01
* `의존성` Androidx MultiDex 버전 업그레이드 2.0.0 -> 2.0.1
* `의존성` Apache Commons Lang3 버전 업그레이드 3.6 -> 3.12.0
* `의존성` Appcompat 버전 업그레이드 1.0.2 -> 1.4.0
* `의존성` ButterKnife Gradle 플러그인 버전 업그레이드 9.0.0-rc2 -> 10.2.1 -> 10.2.3
* `의존성` ColorPicker 버전 업그레이드 2.1.5 -> 2.1.7
* `의존성` Espresso Core 버전 업그레이드 3.1.1-alpha01 -> 3.5.0-alpha03
* `의존성` Eventbus 버전 업그레이드 3.0.0 -> 3.2.0
* `의존성` Glide Compiler 버전 업그레이드 4.8.0 -> 4.12.0 -> 4.12.0
* `의존성` Gradle Build Tool 버전 업그레이드 29.0.2 -> 30.0.2
* `의존성` Gradle Compile 버전 업그레이드 28 -> 30 -> 31
* `의존성` Gradle 릴리즈 버전 업그레이드 4.10.2 -> 6.5 -> 7.0.2 -> 7.3
* `의존성` Groovy-Json 플러그인 버전 업그레이드 3.0.7 -> 3.0.8
* `의존성` Gson 버전 업그레이드 2.8.2 -> 2.8.9
* `의존성` JavaVersion 버전 업그레이드 1.8 -> 11 -> 16
* `의존성` Joda Time 버전 업그레이드 2.9.9 -> 2.10.13
* `의존성` Junit 버전 업그레이드 4.12 -> 4.13.2
* `의존성` Kotlin Gradle 플러그인 버전 업그레이드 1.3.10 -> 1.4.10 -> 1.6.0
* `의존성` Kotlinx Coroutines 버전 업그레이드 1.0.1 -> 1.5.2-native-mt
* `의존성` LeakCanary 버전 업그레이드 1.6.1 -> 2.7
* `의존성` LicensesDialog 버전 업그레이드 1.8.1 -> 2.2.0
* `의존성` Material Dialogs 버전 업그레이드 0.9.2.3 -> 0.9.6.0
* `의존성` OkHttp3 버전 업그레이드 3.10.0 -> 5.0.0-alpha.2 -> 5.0.0-alpha.3
* `의존성` Reactivex RxJava2 RxAndroid 버전 업그레이드 2.0.1 -> 2.1.1
* `의존성` Reactivex RxJava2 버전 업그레이드 2.1.2 -> 2.2.21
* `의존성` Retrofit2 Converter Gson 버전 업그레이드 2.3.0 -> 2.9.0
* `의존성` Retrofit2 Retrofit 버전 업그레이드 2.3.0 -> 2.9.0
* `의존성` Zip4j 버전 업그레이드 1.3.2 -> 2.9.1